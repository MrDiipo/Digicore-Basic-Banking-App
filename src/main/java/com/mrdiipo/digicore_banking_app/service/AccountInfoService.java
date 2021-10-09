package com.mrdiipo.digicore_banking_app.service;

import com.mrdiipo.digicore_banking_app.dto.AccountInfoDto;

public interface AccountInfoService {

    AccountInfoDto getAccountInfo(String accountNumber, String accountBalance);

}
