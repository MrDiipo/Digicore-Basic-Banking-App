package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import com.mrdiipo.digicore_banking_app.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// A model class for transferring data between different layers of the application
public final class AccountInfoDto {

    private final ResponseCodes responseCode;
    private final boolean success;
    private final String message;
    private final Account account;

}
