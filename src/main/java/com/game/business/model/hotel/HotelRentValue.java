package com.game.business.model.hotel;

public class HotelRentValue {
   private double value;
   private double rent;

    public HotelRentValue(double value, double rent) {
        this.value = value;
        this.rent = rent;
    }

    public double getValue() {
        return value;
    }

    public double getRent() {
        return rent;
    }
}
