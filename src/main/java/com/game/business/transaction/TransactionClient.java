package com.game.business.transaction;

import com.game.business.model.PlayerCell;
import com.game.business.model.cell.CellType;
import com.game.business.model.hotel.HotelType;
import com.game.business.transaction.jail.JailTransaction;
import com.game.business.transaction.lottery.LotteryTransaction;

import java.util.HashMap;
import java.util.Map;

public class TransactionClient {
    private static Map<CellType, Transaction> cellTransactionMap = new HashMap<>();
    private static Map<HotelType, Transaction> hotelTypeTransactionMap = new HashMap<>();
    private static Transaction TRANS = (a,b)-> {

    };

    static {
        cellTransactionMap.put(CellType.JAIL, new JailTransaction());
        cellTransactionMap.put(CellType.LOTTERY, new LotteryTransaction());
        cellTransactionMap.put(CellType.EMPTY, TRANS);
    }

    public static Transaction getTransaction(PlayerCell playerCell) {
        CellType cellType = playerCell.getCell().getCellType();
        if(cellType == CellType.HOTEL) {
            return TRANS;
        }else {
            return cellTransactionMap.get(cellType);
        }

    }
}
