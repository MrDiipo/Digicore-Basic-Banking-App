package com.mrdiipo.digicore_banking_app.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public final class Account {

    private String accountName;
    private String accountNumber;
    private BigDecimal balance;

    private Account(final String accountName,
                    final String accountNumber,
                    final BigDecimal balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

}
