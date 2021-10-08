package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
// A model class for transferring withdrawal data between different layers of the application
public class WithdrawalDto {

    private final String accountNumber;
    private final String accountPassword;
    private final BigDecimal withdrawnAmount;

    private final ResponseCodes responseCode;
    private final boolean successful;
    private final String message;

}
