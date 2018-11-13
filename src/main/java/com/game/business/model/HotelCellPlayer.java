package com.game.business.model;

import com.game.business.model.player.Player;

import java.util.LinkedList;
import java.util.List;

public class HotelCellPlayer {
    private HotelCell hotelCell;
    private List<Player> players = new LinkedList();
    private Player owner;

    public HotelCell getHotelCell() {
        return hotelCell;
    }

    public void setHotelCell(HotelCell hotelCell) {
        this.hotelCell = hotelCell;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
