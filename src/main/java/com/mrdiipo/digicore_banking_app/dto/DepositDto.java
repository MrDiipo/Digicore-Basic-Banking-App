package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// A model class for transferring deposit data between different layers of the application
public final class DepositDto {

    private Date depositDate;
    private  String accountNumber;
    private  BigDecimal amount;
    private BigDecimal balance;

    private  ResponseCodes responseCode;
    private  boolean success;
    private  String message;

}
