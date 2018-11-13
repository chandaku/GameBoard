package com.game.business.transaction.hotel;

import com.game.business.model.bank.Bank;
import com.game.business.model.hotel.HotelRentValue;
import com.game.business.model.hotel.HotelType;
import com.game.business.model.player.Player;

public class SilverHotelTransaction extends HotelTransaction {

    private HotelRentValue hotelRentValue = getHotelRentValue(HotelType.SILVER);

    @Override
    protected void hotelTransaction() {
        hotelCellPlayer.getOwner();
    }

    @Override
    protected void payToBank(Bank bank) {
        bank.addMoney(hotelRentValue.getValue());
    }

    @Override
    protected void payToPlayer(Player player) {
        player.deductMoney(hotelRentValue.getValue());
    }
}
