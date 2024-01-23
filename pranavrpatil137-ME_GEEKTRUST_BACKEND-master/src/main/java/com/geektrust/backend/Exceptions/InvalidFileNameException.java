package com.geektrust.backend.Exceptions;

public class InvalidFileNameException extends RuntimeException {

    public InvalidFileNameException() {
        super();
    }

    public InvalidFileNameException(String message) {
        super(message);
    }
    
}
