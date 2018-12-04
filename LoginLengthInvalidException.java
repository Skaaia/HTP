package com.skaaria;

public class LoginLengthInvalidException extends Exception {

    private  String customMessage;

    public LoginLengthInvalidException(String customMessage) {
        this.customMessage = customMessage;
    }
}
