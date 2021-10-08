package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// REST request object class for account creation
public final class CreateAccountResponse {

    private final ResponseCodes responseCode;
    private final boolean success;
    private final String message;

}
