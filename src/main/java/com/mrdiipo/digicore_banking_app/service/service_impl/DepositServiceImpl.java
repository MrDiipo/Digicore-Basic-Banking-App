package com.mrdiipo.digicore_banking_app.service.service_impl;

import com.mrdiipo.digicore_banking_app.dto.DepositDto;
import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import com.mrdiipo.digicore_banking_app.exception.AccountDepositException;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.repository.AccountRepository;
import com.mrdiipo.digicore_banking_app.service.DepositService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public final class DepositServiceImpl implements DepositService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public DepositDto depositAmount(BigDecimal amount, String accountNumber) throws AccountNotFoundException, AccountDepositException {

        DepositDto depositDto = new DepositDto();

        if (accountRepository.findByAccountNum(accountNumber) != null) throw new AccountNotFoundException(accountNumber);

        var compareAmount = amount.compareTo(new BigDecimal("1_000_000.00"));
        if (compareAmount == 1) throw new AccountDepositException(String.valueOf(amount));

        accountRepository.setAccountBalance(amount.add(accountRepository.getAccountBalance()));

        depositDto.setResponseCode(ResponseCodes.SUCCESS);
        depositDto.setSuccess(true);
        depositDto.setMessage("Amount of " + amount + " was successfully deposited into the account");

        return depositDto;
    }
}
