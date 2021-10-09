package com.mrdiipo.digicore_banking_app.service.service_impl;

import com.mrdiipo.digicore_banking_app.dto.AccountDto;
import com.mrdiipo.digicore_banking_app.dto.AccountInfoDto;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.exception.IncorrectPasswordException;
import com.mrdiipo.digicore_banking_app.repository.AccountRepository;
import com.mrdiipo.digicore_banking_app.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private AccountRepository accountRepository ;


    @Override
    public AccountDto getAccountInfo(String accountNumber, String password) throws AccountNotFoundException, IncorrectPasswordException {

        if (accountRepository.findByAccountNum(accountNumber) != null) throw new AccountNotFoundException(accountNumber);

        if(!accountRepository.getAccountPassword(password).equals(password)) throw new IncorrectPasswordException(password);

        AccountDto accountDto = new AccountDto();
        accountDto.setAccountName(accountRepository.getAccountName());
        accountDto.setAccountNumber(accountNumber);
        accountDto.setBalance(accountRepository.getAccountBalance());

        return accountDto;
    }
}
