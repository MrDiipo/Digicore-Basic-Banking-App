package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
// A model class for transferring account creation data between different layers of the application
public final class CreateAccountDto {

    private final String accountName;
    private final String accountPassword;
    private final BigDecimal initialDeposit;

    private final ResponseCodes responseCode;
    private final boolean success;
    private final String message;

}
