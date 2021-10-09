package com.mrdiipo.digicore_banking_app.repository;

import com.mrdiipo.digicore_banking_app.dto.WithdrawalDto;

public interface AccountTransactions {

    void withdrawTransaction(WithdrawalDto withdrawalDto);
    void depositTransaction(DepositDto depositDto);

}
