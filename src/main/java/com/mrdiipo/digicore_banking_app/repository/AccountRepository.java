package com.mrdiipo.digicore_banking_app.repository;

import java.math.BigDecimal;

public interface AccountRepository {
    String findByAccountNum(String accountNumber);

    String getAccountPassword(String password);

    BigDecimal getAccountBalance();

    String getAccountName();
}
