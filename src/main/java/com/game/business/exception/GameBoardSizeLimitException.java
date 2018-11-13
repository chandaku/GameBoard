package com.game.business.exception;

public class GameBoardSizeLimitException extends RuntimeException {
    public GameBoardSizeLimitException(String message) {
        super(message);
    }
}
