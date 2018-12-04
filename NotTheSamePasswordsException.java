package com.skaaria;

public class NotTheSamePasswordsException extends Exception {

    private  String customMessage;

    public NotTheSamePasswordsException(String customMessage) {
        this.customMessage = customMessage;
    }
}
