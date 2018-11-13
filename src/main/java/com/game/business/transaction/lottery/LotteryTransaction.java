package com.game.business.transaction.lottery;

import com.game.business.model.bank.Bank;
import com.game.business.model.player.Player;
import com.game.business.transaction.CellTransaction;

public class LotteryTransaction extends CellTransaction {

    private double amount;

    @Override
    protected void payToBank(Bank bank) {
        bank.deductMoney(amount);
    }

    @Override
    protected void payToPlayer(Player player) {
        player.addMoney(amount);
    }
}
