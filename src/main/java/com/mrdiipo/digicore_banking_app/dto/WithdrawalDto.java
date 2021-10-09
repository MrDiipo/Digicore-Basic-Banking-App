package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
// A model class for transferring withdrawal data between different layers of the application
public final class WithdrawalDto {

    private Date withdrawDate;
    private  String accountNumber;
    private  String accountPassword;
    private  BigDecimal withdrawnAmount;
    private BigDecimal balance;

    private  ResponseCodes responseCode;
    private  boolean successful;
    private  String message;

}
