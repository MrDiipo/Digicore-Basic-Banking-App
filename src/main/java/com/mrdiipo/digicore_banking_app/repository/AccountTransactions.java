package com.mrdiipo.digicore_banking_app.repository;

import com.mrdiipo.digicore_banking_app.dto.DepositDto;
import com.mrdiipo.digicore_banking_app.dto.WithdrawalDto;

import java.util.Date;

public interface AccountTransactions {

    WithdrawalDto withdrawTransaction();

    DepositDto depositTransaction();

}
