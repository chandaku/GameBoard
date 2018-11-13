package com.game.business.transaction.hotel;

import com.game.business.model.HotelCellPlayer;
import com.game.business.model.bank.Bank;
import com.game.business.model.hotel.HotelRentValue;
import com.game.business.model.hotel.HotelType;
import com.game.business.model.player.Player;
import com.game.business.transaction.CellTransaction;

import java.util.HashMap;
import java.util.Map;

public abstract class HotelTransaction extends CellTransaction {

    protected static final Map<HotelType, HotelRentValue> HOTEL_RENT_VALUE_MAP = new HashMap();
    static
        {
            HOTEL_RENT_VALUE_MAP.put(HotelType.SILVER, new HotelRentValue(200, 50));
            HOTEL_RENT_VALUE_MAP.put(HotelType.GOLD, new HotelRentValue(300, 100));
            HOTEL_RENT_VALUE_MAP.put(HotelType.PLATINUM, new HotelRentValue(400, 200));
        }

    protected HotelRentValue getHotelRentValue(HotelType key){
        return HOTEL_RENT_VALUE_MAP.get(key);
    }
    protected HotelCellPlayer hotelCellPlayer;

    public void setHotelCellPlayer(HotelCellPlayer hotelCellPlayer) {
        this.hotelCellPlayer = hotelCellPlayer;
    }

    protected abstract void hotelTransaction();

    @Override
    public synchronized void calculate(Bank bank, Player player) {
        super.calculate(bank, player);
        hotelTransaction();
    }
}
