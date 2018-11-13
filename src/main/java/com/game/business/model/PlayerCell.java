package com.game.business.model;

import com.game.business.model.cell.Cell;
import com.game.business.model.player.Player;

public class PlayerCell {
    private Player player;
    private Cell cell;

    public PlayerCell(Cell cell, Player player) {
        this.cell = cell;
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void moveTo(Cell cell) {
        this.cell = cell;
    }

}
