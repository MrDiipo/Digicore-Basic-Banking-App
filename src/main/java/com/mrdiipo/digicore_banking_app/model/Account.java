package com.mrdiipo.digicore_banking_app.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {

    private String accountName;
    private String accountNumber;
    private BigDecimal balance;

    private Account(String accountName, String accountNumber, BigDecimal balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

}
