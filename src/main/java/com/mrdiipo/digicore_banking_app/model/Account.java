package com.mrdiipo.digicore_banking_app.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public final class Account {

    private final String accountName;
    private final String accountNumber;
    private final String accountPassword;
    private final BigDecimal accountBalance;

    private Account(String accountName,
                    String accountNumber,
                    String accountPassword, BigDecimal accountBalance) {

        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;

    }

}
