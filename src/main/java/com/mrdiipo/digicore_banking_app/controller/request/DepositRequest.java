package com.mrdiipo.digicore_banking_app.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
// REST request object class for deposition transactions
public final class DepositRequest {

    private final String accountNumber;
    private final BigDecimal amount;

}
