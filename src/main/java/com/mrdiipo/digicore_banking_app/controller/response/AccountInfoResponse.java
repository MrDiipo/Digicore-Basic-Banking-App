package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountInfoResponse {

    private int responseCode;
    private boolean success;
    private String message;
    private Account account;
}
