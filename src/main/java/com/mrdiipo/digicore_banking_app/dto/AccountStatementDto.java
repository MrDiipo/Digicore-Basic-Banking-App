package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
// A model class for transferring data between different layers of the application
public class AccountStatementDto {

    private final Date transactionDate;
    private final TransactionType transactionType;
    private final String narration;
    private final BigDecimal amount;
    private final BigDecimal accountBalance;

}
