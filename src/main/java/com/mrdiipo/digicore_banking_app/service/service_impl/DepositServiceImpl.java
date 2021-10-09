package com.mrdiipo.digicore_banking_app.service.service_impl;

import com.mrdiipo.digicore_banking_app.dto.DepositDto;
import com.mrdiipo.digicore_banking_app.exception.AccountDepositException;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.repository.AccountRepository;
import com.mrdiipo.digicore_banking_app.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public final class DepositServiceImpl implements DepositService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public DepositDto depositAmount(BigDecimal amount, String accountNumber) throws AccountNotFoundException, AccountDepositException {

        if (accountRepository.findByAccountNum(accountNumber) != null) throw new AccountNotFoundException(accountNumber);

        return null;
    }
}
