package com.mrdiipo.digicore_banking_app.service;

import com.mrdiipo.digicore_banking_app.dto.AccountInfoDto;

import javax.security.auth.login.AccountNotFoundException;

public interface AccountInfoService {

    AccountInfoDto getAccountInfo(String accountNumber, String password) throws AccountNotFoundException;

}
