package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
// A model class for transferring account creation data between different layers of the application
public final class CreateAccountDto {

    private  String accountName;
    private  String accountPassword;
    private  BigDecimal initialDeposit;

    private  ResponseCodes responseCode;
    private  boolean success;
    private  String message;

    private String accountNumber;
}
