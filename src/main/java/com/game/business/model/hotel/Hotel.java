package com.game.business.model.hotel;

public class Hotel {
    private int id;
    private HotelType hotelType = HotelType.SILVER;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }
}
