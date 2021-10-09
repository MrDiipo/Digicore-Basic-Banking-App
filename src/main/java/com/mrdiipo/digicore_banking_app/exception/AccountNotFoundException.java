package com.mrdiipo.digicore_banking_app.exception;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String message) {
        super(message);
        System.out.println("Account with Account Number " + message + " does not exist.");
    }
}
