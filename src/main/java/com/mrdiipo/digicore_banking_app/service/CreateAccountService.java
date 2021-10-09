package com.mrdiipo.digicore_banking_app.service;

import com.mrdiipo.digicore_banking_app.controller.request.CreateAccountRequest;
import com.mrdiipo.digicore_banking_app.dto.CreateAccountDto;

public interface CreateAccountService {

    CreateAccountDto createAccount(CreateAccountRequest createAccountRequest);

}
