package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// A model class for transferring data between different layers of the application
public final class AccountStatementDto {

    private  Date transactionDate;
    private  TransactionType transactionType;
    private  String narration;
    private  BigDecimal amount;
    private  BigDecimal accountBalance;

}
