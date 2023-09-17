package com.smartbrain.exceptions;

public class InvalidDateOfBirthException extends RuntimeException {
    public InvalidDateOfBirthException(String errorMessage) {
        super(errorMessage);
    }
}
