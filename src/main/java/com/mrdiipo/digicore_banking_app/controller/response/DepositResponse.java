package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// REST response object class for deposition transactions
public final class DepositResponse {

    private  ResponseCodes responseCode;
    private  boolean success;
    private  String message;

}
