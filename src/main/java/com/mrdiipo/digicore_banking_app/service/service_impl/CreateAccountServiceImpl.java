package com.mrdiipo.digicore_banking_app.service.service_impl;

import com.mrdiipo.digicore_banking_app.controller.request.CreateAccountRequest;
import com.mrdiipo.digicore_banking_app.dto.CreateAccountDto;
import com.mrdiipo.digicore_banking_app.exception.AccountDepositException;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.repository.AccountRepository;
import com.mrdiipo.digicore_banking_app.service.CreateAccountService;
import com.mrdiipo.digicore_banking_app.util.AccountNumberGenerator;
import lombok.var;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class CreateAccountServiceImpl implements CreateAccountService {

    @Autowired
    private AccountRepository accountRepository;

    private  final BigDecimal initialDeposit = new BigDecimal("500");

    @Override
    public CreateAccountDto createAccount(CreateAccountDto createAccountDto) {

        if (accountRepository.findByAccountNum(createAccountDto.getAccountNumber()) != null)
            throw new AccountNotFoundException(createAccountDto.getAccountName());

        var compareAmount = createAccountDto.getInitialDeposit().compareTo(initialDeposit);

        if (compareAmount != 0 && compareAmount != 1)
            throw new AccountDepositException(String.valueOf(createAccountDto.getInitialDeposit()));

        CreateAccountDto returnedDto = new CreateAccountDto();

        BeanUtils.copyProperties(createAccountDto, returnedDto);

        returnedDto.setAccountNumber(AccountNumberGenerator.generateAccountNumber(10));

        return returnedDto;
    }
}
