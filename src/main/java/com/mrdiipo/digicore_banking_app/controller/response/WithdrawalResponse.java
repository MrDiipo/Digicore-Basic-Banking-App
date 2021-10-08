package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// REST response object class for withdrawal transactions
public final class WithdrawalResponse {

    private final ResponseCodes responseCode;
    private final boolean successful;
    private final String message;

}
