package com.game.business.model.player;

public class Player {
    private int id;
    private double money;

    private Player(int id, double money) {
        this.id = id;
        this.money = money;
    }

    public synchronized void addMoney(Double money) {
        this.money = + money;
    }

    public synchronized void deductMoney(Double money) {
        this.money = - money;
    }

    public static Player createPlayer(int id, double money) {
        return new Player(id, money);
    }
}
