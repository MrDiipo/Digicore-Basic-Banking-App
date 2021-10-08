package com.mrdiipo.digicore_banking_app.exception;

public class AccountInfoException extends RuntimeException{
    public AccountInfoException(String message) {
        super(message);
        System.out.println("Account with Account Number " + message + " does not exist.");
    }
}
