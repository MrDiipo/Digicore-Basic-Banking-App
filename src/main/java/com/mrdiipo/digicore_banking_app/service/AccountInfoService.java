package com.mrdiipo.digicore_banking_app.service;

import com.mrdiipo.digicore_banking_app.dto.AccountInfoDto;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;

public interface AccountInfoService {

    AccountInfoDto getAccountInfo(String accountNumber, String password) throws AccountNotFoundException;

}
