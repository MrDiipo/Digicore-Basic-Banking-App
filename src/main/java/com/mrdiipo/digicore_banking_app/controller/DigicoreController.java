package com.mrdiipo.digicore_banking_app.controller;

import com.mrdiipo.digicore_banking_app.controller.request.CreateAccountRequest;
import com.mrdiipo.digicore_banking_app.controller.request.DepositRequest;
import com.mrdiipo.digicore_banking_app.controller.request.LoginRequest;
import com.mrdiipo.digicore_banking_app.controller.request.WithdrawalRequest;
import com.mrdiipo.digicore_banking_app.controller.response.*;
import com.mrdiipo.digicore_banking_app.dto.AccountDto;
import com.mrdiipo.digicore_banking_app.dto.AccountInfoDto;
import com.mrdiipo.digicore_banking_app.dto.AccountStatementDto;
import com.mrdiipo.digicore_banking_app.enums.ResponseCodes;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.service.AccountInfoService;
import com.mrdiipo.digicore_banking_app.service.AccountStatementService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
// Class containing endpoints for the application
public class DigicoreController {

    @Autowired
    private AccountInfoService accountInfoService;

    @Autowired
    private AccountStatementService accountStatementService;

    /*Get Mappings*/

    @GetMapping(path = "/account_info/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public AccountInfoResponse getAccountInfo(@PathVariable ("accountNumber") String accountNumber, String password) throws AccountNotFoundException {

        AccountDto accountDto = accountInfoService.getAccountInfo(accountNumber, password);

        return new AccountInfoResponse(ResponseCodes.SUCCESS, true, null, accountDto);
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
    public DepositResponse deposit(@RequestBody DepositRequest depositRequest){


        return null;
    }


    @PostMapping(path = "/withdrawal",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public WithdrawalResponse withdrawal(@RequestBody WithdrawalRequest withdrawalRequest){

        return null;
    }

    @PostMapping(path = "/create_account",
             produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public CreateAccountResponse createAccount(@RequestBody CreateAccountRequest createAccountRequest){
        return null;
    }

    @PostMapping(path = "/login",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return null;
    }


}
