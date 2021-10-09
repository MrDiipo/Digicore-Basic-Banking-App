package com.mrdiipo.digicore_banking_app.dto;

import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import com.mrdiipo.digicore_banking_app.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// A model class for transferring data between different layers of the application
public final class AccountInfoDto {

    private ResponseCodes responseCode;
    private boolean success;
    private String message;
    private AccountDto accountDto;

}
