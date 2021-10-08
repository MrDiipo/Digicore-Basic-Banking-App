package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// Rest response object class for deposition transactions
public final class DepositResponse {

    private final ResponseCodes responseCode;
    private final boolean success;
    private final String message;

}
