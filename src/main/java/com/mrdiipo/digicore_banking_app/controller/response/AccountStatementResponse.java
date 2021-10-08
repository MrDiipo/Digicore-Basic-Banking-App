package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.controller.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
// Rest response object class for querying account statement
public class AccountStatementResponse {

    private Date transactionDate;
    private TransactionType  transactionType;
    private String narration;
    private BigDecimal amount;
    private BigDecimal accountBalance;

}
