package com.mrdiipo.digicore_banking_app.controller.response;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// REST request object class for account creation
public final class CreateAccountResponse {

    private  ResponseCodes responseCode;
    private  boolean success;
    private  String message;

}
