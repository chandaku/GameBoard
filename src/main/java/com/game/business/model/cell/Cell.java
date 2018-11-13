package com.game.business.model.cell;

import java.util.Objects;

public class Cell {
    private final Integer index;
    private final CellType cellType;

    private Cell(int index, CellType cellType) {
        this.index = index;
        this.cellType = cellType;
    }

    public static Cell createCell(int id, CellType cellType) {
        return new Cell(id, cellType);
    }

    public Integer getIndex() {
        return index;
    }

    public CellType getCellType() {
        return cellType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Objects.equals(index, cell.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
