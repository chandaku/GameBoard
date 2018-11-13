package com.game.business.model.bank;

public class Bank {
    private int id;
    private Double money;

    private Bank(int id, Double money) {
        this.id = id;
        this.money = money;
    }

    public synchronized void addMoney(Double money) {
        this.money = + money;
    }

    public synchronized void deductMoney(Double money) {
        this.money = - money;
    }

    public static Bank createBank(int id, double money) {
        return new Bank(id, new Double(money));
    }
}
