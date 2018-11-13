package com.game.business.transaction;

import com.game.business.model.bank.Bank;
import com.game.business.model.player.Player;

public abstract class CellTransaction implements Transaction {
    protected abstract void payToBank(Bank bank);
    protected abstract void payToPlayer(Player player);

    @Override
    public synchronized void calculate(Bank bank, Player player) {
        payToBank(bank);
        payToPlayer(player);
    }
}
