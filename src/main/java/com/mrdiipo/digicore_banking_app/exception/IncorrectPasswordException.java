package com.mrdiipo.digicore_banking_app.exception;

public class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException(String message) {
        super(message);
        System.out.println("The password " + message + " is incorrect");
    }
}
