package com.mrdiipo.digicore_banking_app.exception;

public class BaseAccountBalanceException extends RuntimeException{
    public BaseAccountBalanceException(String message) {
        super(message);
        System.out.println("Insufficient Account Balance. Account Balanace after withdrawal must be more than #500.00.");
    }
}
