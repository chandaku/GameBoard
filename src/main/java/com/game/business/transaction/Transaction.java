package com.game.business.transaction;

import com.game.business.model.bank.Bank;
import com.game.business.model.player.Player;

public interface Transaction {
    void calculate(Bank bank, Player player);
}
