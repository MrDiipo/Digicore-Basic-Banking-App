package com.mrdiipo.digicore_banking_app.exception;

import com.mrdiipo.digicore_banking_app.controller.response.DepositResponse;

public class AccountAlreadyExistsException extends RuntimeException{

    private DepositResponse depositResponse;

    public AccountAlreadyExistsException(String message) {
        super(message);
        System.out.println("Account number  " + message + " already exists.");
    }
    // TODO: Work on response codes on all endpoints
}
