package com.geektrust.backend.Exceptions;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String message) {
        super(message);
    }
    
}
