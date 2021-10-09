package com.mrdiipo.digicore_banking_app.service.service_impl;

import com.mrdiipo.digicore_banking_app.dto.WithdrawalDto;
import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.exception.BaseAccountBalanceException;
import com.mrdiipo.digicore_banking_app.repository.AccountRepository;
import com.mrdiipo.digicore_banking_app.service.WithdrawalService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public final class WithdrawalServiceImpl implements WithdrawalService {

    @Autowired
    private AccountRepository accountRepository;

    private static final BigDecimal minBalance = new BigDecimal("500");

    @Override
    public WithdrawalDto withdraw(BigDecimal amount, String accountNumber) throws AccountNotFoundException {

        WithdrawalDto withdrawalDto = new WithdrawalDto();

        if (accountRepository.findByAccountNum(accountNumber) != null) throw new AccountNotFoundException(accountNumber);

        var compareAmount = minBalance.compareTo(accountRepository.getAccountBalance());

        if (compareAmount != 0 && compareAmount != 1)
            throw new BaseAccountBalanceException(String.valueOf(accountRepository.getAccountBalance()));

        accountRepository.setAccountBalance(accountRepository.getAccountBalance().subtract(amount));

        withdrawalDto.setResponseCode(ResponseCodes.SUCCESS);
        withdrawalDto.setSuccessful(true);
        withdrawalDto.setMessage("Amount of " + amount + " was successfully withdrawn from the account");

        return null;
    }
}
