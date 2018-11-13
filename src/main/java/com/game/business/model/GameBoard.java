package com.game.business.model;

import com.game.business.exception.GameBoardSizeLimitException;
import com.game.business.model.cell.Cell;
import com.game.business.model.cell.CellType;

import java.util.*;

public class GameBoard {
    int size = 10;
    private Cell start;
    private List<Cell> cells = new LinkedList<>();
    private Map<Cell, HotelCellPlayer> hotelCellPlayerMap = new HashMap<>();

    private GameBoard(int size) {
        this.size = size;
    }

    public void addCell(Cell cell) {
        if (cells.size() < size) {
            cells.add(cell);
            putToHotelCellPlayerMap(cell);
            startCell(cell);
        } else {
            throw new GameBoardSizeLimitException("Board Size Limit is reached");
        }
    }

    private void startCell(Cell cell) {
        if(cell.getCellType()==CellType.START) {
            start = cell;
        }
    }

    private void putToHotelCellPlayerMap(Cell cell) {
        if (cell.getCellType() == CellType.HOTEL) {
            hotelCellPlayerMap.put(cell, new HotelCellPlayer());
        }
    }

    public static GameBoard create(int size) {
        return new GameBoard(size);
    }

    public void dice(int number, PlayerCell playerCell) {
        int newIndex = (playerCell.getCell().getIndex() + number) - 1;
        playerCell.moveTo(cells.get(newIndex));
    }

    public Cell getStart () {
        return start;
    }

}
