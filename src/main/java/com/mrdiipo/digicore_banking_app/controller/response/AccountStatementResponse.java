package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.TransactionType;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
// REST response object class for querying account statement
public final class AccountStatementResponse {

    private final Date transactionDate;
    private final TransactionType  transactionType;
    private final String narration;
    private final BigDecimal amount;
    private final BigDecimal accountBalance;


}
