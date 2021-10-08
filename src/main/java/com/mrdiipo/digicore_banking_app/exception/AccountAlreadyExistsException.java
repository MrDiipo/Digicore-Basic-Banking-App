package com.mrdiipo.digicore_banking_app.exception;

public class AccountAlreadyExistsException extends RuntimeException{
    public AccountAlreadyExistsException(String message) {
        super(message);
        System.out.println("Account already exists.");
    }
}
