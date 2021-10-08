package com.mrdiipo.digicore_banking_app.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// REST request object class for logging information
public final class LoginResponse {

    private final boolean success;
    private final String accessToken;

}
