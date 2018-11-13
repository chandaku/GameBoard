package com.game.business.model;

import com.game.business.model.cell.Cell;
import com.game.business.model.hotel.HotelType;

import java.util.Objects;

public class HotelCell {
    private HotelType hotelType = HotelType.SILVER;
    private Cell cell;

    public HotelCell(Cell cell) {
        this.cell = cell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelCell hotelCell = (HotelCell) o;
        return Objects.equals(cell, hotelCell.cell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cell);
    }
}
