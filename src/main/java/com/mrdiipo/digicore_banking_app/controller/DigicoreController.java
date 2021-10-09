package com.mrdiipo.digicore_banking_app.controller;

import com.mrdiipo.digicore_banking_app.controller.request.CreateAccountRequest;
import com.mrdiipo.digicore_banking_app.controller.request.DepositRequest;
import com.mrdiipo.digicore_banking_app.controller.request.LoginRequest;
import com.mrdiipo.digicore_banking_app.controller.request.WithdrawalRequest;
import com.mrdiipo.digicore_banking_app.controller.response.*;
import com.mrdiipo.digicore_banking_app.dto.*;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
// Class containing endpoints for the application
public class DigicoreController {

    @Autowired
    private AccountInfoService accountInfoService;

    @Autowired
    private AccountStatementService accountStatementService;

    @Autowired
    private DepositService depositService;

    @Autowired
    private WithdrawalService withdrawalService;

    @Autowired
    private CreateAccountService createAccountService;

    /*Get Mappings*/

    @GetMapping(path = "/account_info/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public AccountInfoResponse getAccountInfo(@PathVariable ("accountNumber") String accountNumber, String password) throws AccountNotFoundException {

        AccountInfoResponse accountInfoResponse = new AccountInfoResponse();

        AccountInfoDto accountInfoDto = accountInfoService.getAccountInfo(accountNumber, password);

        BeanUtils.copyProperties(accountInfoDto, accountInfoResponse);

        return accountInfoResponse;
    }

    @GetMapping(path = "/account_statement/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public AccountStatementResponse getAccountStatement(@PathVariable ("accountNumber") String accountNumber, String password) throws AccountNotFoundException{

        AccountStatementDto accountStatementDto = accountStatementService.getAccountStatement(accountNumber, password);

        AccountStatementResponse accountStatementResponse = new AccountStatementResponse();

        BeanUtils.copyProperties(accountStatementDto, accountStatementResponse);

        return accountStatementResponse;
    }

    /*Post Mappings*/

    @PostMapping(path = "/deposit",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public DepositResponse deposit(@RequestBody DepositRequest depositRequest) throws AccountNotFoundException{

        DepositResponse depositResponse = new DepositResponse();

        DepositDto depositDto = depositService.depositAmount(depositRequest.getAmount(), depositRequest.getAccountNumber());

        BeanUtils.copyProperties(depositDto, depositResponse);

        return depositResponse;
    }


    @PostMapping(path = "/withdrawal",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public WithdrawalResponse withdrawal(@RequestBody WithdrawalRequest withdrawalRequest){

        // TODO: Work on response codes on all endpoints
        WithdrawalResponse withdrawalResponse = new WithdrawalResponse();

        WithdrawalDto withdrawalDto = withdrawalService.withdraw(withdrawalRequest.getWithdrawnAmount(), withdrawalRequest.getAccountNumber());

        BeanUtils.copyProperties(withdrawalDto, withdrawalResponse);

        return withdrawalResponse;
    }

    @PostMapping(path = "/create_account",
             produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public CreateAccountResponse createAccount(@RequestBody CreateAccountRequest createAccountRequest){

        CreateAccountDto createAccountDto = new CreateAccountDto();

        BeanUtils.copyProperties(createAccountRequest, createAccountDto);

        createAccountDto = createAccountService.createAccount(createAccountDto);

        CreateAccountResponse createAccountResponse = new CreateAccountResponse();

        BeanUtils.copyProperties(createAccountDto, createAccountResponse);

        return createAccountResponse;
    }

    @PostMapping(path = "/login",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return null;
    }


}
