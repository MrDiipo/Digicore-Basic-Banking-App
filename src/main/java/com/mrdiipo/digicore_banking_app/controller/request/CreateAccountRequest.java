package com.mrdiipo.digicore_banking_app.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
// Rest request object class for creating account
public final class CreateAccountRequest {

    private final String accountName;
    private final String accountPassword;
    private final BigDecimal initialDeposit;

}
