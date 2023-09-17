package com.smartbrain.exceptions;

public class WrongDateOfBirthFormatException extends RuntimeException {
    public WrongDateOfBirthFormatException(String errorMessage) {
        super(errorMessage);
    }
}
