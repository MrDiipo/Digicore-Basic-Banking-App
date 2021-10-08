package com.mrdiipo.digicore_banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class LoginDto {

    private final String accountNumber;
    private final String accountPassword;

    private final boolean success;
    private final String accessToken;

}
