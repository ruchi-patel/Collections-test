package com.quantum;

public class NegativeAgeException extends RuntimeException {
    public NegativeAgeException(String message) {
        super(message);
    }
}
