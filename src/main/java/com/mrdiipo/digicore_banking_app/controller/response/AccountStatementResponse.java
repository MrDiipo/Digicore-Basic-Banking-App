package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.controller.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
// Rest response object class for querying account statement
public final class AccountStatementResponse {

    private Date transactionDate;
    private TransactionType  transactionType;
    private String narration;
    private BigDecimal amount;
    private BigDecimal accountBalance;

    public AccountStatementResponse(final Date transactionDate,
                                    final TransactionType transactionType,
                                    final String narration,
                                    final BigDecimal amount,
                                    final BigDecimal accountBalance) {
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.narration = narration;
        this.amount = amount;
        this.accountBalance = accountBalance;
    }
}
