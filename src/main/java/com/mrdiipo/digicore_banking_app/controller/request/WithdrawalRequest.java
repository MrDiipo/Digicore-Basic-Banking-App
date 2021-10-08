package com.mrdiipo.digicore_banking_app.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
// REST request object class for withdrawal transactions
public final class WithdrawalRequest {

    private final String accountNumber;
    private final String accountPassword;
    private final BigDecimal withdrawnAmount;

}
