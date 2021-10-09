package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// REST response object class for withdrawal transactions
public final class WithdrawalResponse {

    private  ResponseCodes responseCode;
    private  boolean successful;
    private  String message;

}
