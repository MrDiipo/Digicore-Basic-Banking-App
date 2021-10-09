package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class DepositDto {

    private  String accountNumber;
    private  BigDecimal amount;

    private  ResponseCodes responseCode;
    private  boolean success;
    private  String message;
}
