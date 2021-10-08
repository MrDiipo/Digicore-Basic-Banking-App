package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// Rest response object class for querying account information
public final class AccountInfoResponse {

    private int responseCode;
    private boolean success;
    private String message;
    private Account account;

    public AccountInfoResponse(final int responseCode,
                               final boolean success,
                               final String message,
                               final Account account) {
        this.responseCode = responseCode;
        this.success = success;
        this.message = message;
        this.account = account;
    }
}
