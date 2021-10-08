package com.mrdiipo.digicore_banking_app.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// REST request object class for logging information
public final class LoginRequest {

    private final String accountNumber;
    private final String accountPassword;

}
