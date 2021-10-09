package com.mrdiipo.digicore_banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class AccountDto {

    private String accountName;
    private String accountNumber;
    private BigDecimal balance;

}
