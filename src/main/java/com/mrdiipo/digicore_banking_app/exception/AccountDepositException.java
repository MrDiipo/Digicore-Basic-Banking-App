package com.mrdiipo.digicore_banking_app.exception;

public class AccountDepositException extends RuntimeException{
    public AccountDepositException(String message) {
        super(message);
        System.out.println("Cannot perform deposit transaction for  amount more than #1,000,000.");
    }
}
