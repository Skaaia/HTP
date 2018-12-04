package com.skaaria;

public class InvalidAgeException extends Exception{
    private String customMessage;

    public InvalidAgeException(String customMessage) {
        this.customMessage = customMessage;
    }
}
