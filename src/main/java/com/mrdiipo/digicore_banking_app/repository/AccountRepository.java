package com.mrdiipo.digicore_banking_app.repository;

import java.math.BigDecimal;
import java.util.Date;


public interface AccountRepository {
    String findByAccountNum(String accountNumber);

    String getAccountPassword(String password);

    BigDecimal getAccountBalance();

    void setAccountBalance(BigDecimal amount);

    String getAccountName();

}
