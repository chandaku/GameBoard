package com.game.business.transaction.jail;

import com.game.business.model.bank.Bank;
import com.game.business.model.player.Player;
import com.game.business.transaction.CellTransaction;

public class JailTransaction extends CellTransaction {

    private double amount = 150;

    @Override
    protected void payToBank(Bank bank) {
        bank.addMoney(amount);
    }

    @Override
    protected void payToPlayer(Player player) {
        player.deductMoney(amount);
    }
}
