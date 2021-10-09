package com.mrdiipo.digicore_banking_app.service.service_impl;

import com.mrdiipo.digicore_banking_app.dto.AccountStatementDto;
import com.mrdiipo.digicore_banking_app.enums.TransactionType;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.exception.IncorrectPasswordException;
import com.mrdiipo.digicore_banking_app.repository.AccountRepository;
import com.mrdiipo.digicore_banking_app.repository.AccountTransactions;
import com.mrdiipo.digicore_banking_app.service.AccountStatementService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountStatementServiceImpl implements AccountStatementService {

    @Autowired
    private AccountTransactions accountTransactions;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountStatementDto getAccountStatement(String accountNumber, String password, TransactionType transactionType) throws AccountNotFoundException, IncorrectPasswordException {

        if (accountRepository.findByAccountNum(accountNumber) != null) throw new AccountNotFoundException(accountNumber);

        if(!accountRepository.getAccountPassword(password).equals(password)) throw new IncorrectPasswordException(password);

        AccountStatementDto accountStatementDto = new AccountStatementDto();

        if (transactionType == TransactionType.DEPOSIT){
            accountStatementDto.setTransactionType(TransactionType.DEPOSIT);}
        else {
            accountStatementDto.setTransactionType(TransactionType.WITHDRAWAL);};
        accountStatementDto.setTransactionDate();
        accountStatementDto.setNarration("");
        accountStatementDto.setAmount();
        return null;
    }
}
