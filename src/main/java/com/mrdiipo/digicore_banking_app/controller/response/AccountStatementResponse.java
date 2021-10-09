package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.TransactionType;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
// REST response object class for querying account statement
public final class AccountStatementResponse {

    private  Date transactionDate;
    private  TransactionType  transactionType;
    private  String narration;
    private  BigDecimal amount;
    private  BigDecimal accountBalance;


}
