package com.mrdiipo.digicore_banking_app.service;

import com.mrdiipo.digicore_banking_app.dto.AccountStatementDto;
import com.mrdiipo.digicore_banking_app.enums.TransactionType;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.exception.IncorrectPasswordException;

public interface AccountStatementService {

    AccountStatementDto getAccountStatement(String accountNumber, String password) throws AccountNotFoundException, IncorrectPasswordException;

}
