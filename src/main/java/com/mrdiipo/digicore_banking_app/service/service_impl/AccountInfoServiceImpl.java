package com.mrdiipo.digicore_banking_app.service.service_impl;

import com.mrdiipo.digicore_banking_app.dto.AccountInfoDto;
import com.mrdiipo.digicore_banking_app.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    /*@Autowired
    private AccountRepository accountRepository ;
    **/

    @Override
    public AccountInfoDto getAccountInfo(String accountNumber, String password) {

        /*
        if (accountRepository.findByAccountNum(accountNumber) == null) throw new AccountNotFoundException(accountNumber);

        * */
        return null;
    }
}
