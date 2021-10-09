package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.dto.AccountDto;
import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import com.mrdiipo.digicore_banking_app.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// REST response object class for querying account information
public final class AccountInfoResponse {

    private ResponseCodes responseCode;
    private boolean success;
    private  String message;
    private AccountDto accountDto;

}
