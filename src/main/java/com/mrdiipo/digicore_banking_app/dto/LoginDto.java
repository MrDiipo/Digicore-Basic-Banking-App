package com.mrdiipo.digicore_banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// A model class for transferring logging data between different layers of the application
public final class LoginDto {

    private final String accountNumber;
    private final String accountPassword;

    private final boolean success;
    private final String accessToken;

}
