package com.mrdiipo.digicore_banking_app.service;

import com.mrdiipo.digicore_banking_app.dto.DepositDto;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;

import java.math.BigDecimal;

public interface DepositService {

    DepositDto depositAmount(BigDecimal amount, String accountNumber) throws AccountNotFoundException;

}
