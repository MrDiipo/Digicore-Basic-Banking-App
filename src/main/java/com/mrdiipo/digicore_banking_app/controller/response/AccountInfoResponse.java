package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.dto.AccountDto;
import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import com.mrdiipo.digicore_banking_app.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
// REST response object class for querying account information
public final class AccountInfoResponse {

    private final ResponseCodes responseCode;
    private final boolean success;
    private final String message;
    private final AccountDto accountDto;

}
