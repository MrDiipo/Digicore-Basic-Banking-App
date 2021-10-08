package com.mrdiipo.digicore_banking_app.controller.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
// Rest request object class for deposition transactions
public final class DepositRequest {

    private String accountNumber;
    private BigDecimal amount;

    public DepositRequest(final String accountNumber,
                          final BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}
