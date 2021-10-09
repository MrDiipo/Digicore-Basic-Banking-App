package com.mrdiipo.digicore_banking_app.service;

import com.mrdiipo.digicore_banking_app.dto.DepositDto;
import com.mrdiipo.digicore_banking_app.dto.WithdrawalDto;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;

import java.math.BigDecimal;

public interface WithdrawalService {

    WithdrawalDto withdraw(BigDecimal amount, String accountNumber) throws AccountNotFoundException;

}
