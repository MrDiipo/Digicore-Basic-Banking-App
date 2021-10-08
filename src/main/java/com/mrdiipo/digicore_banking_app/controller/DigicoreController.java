package com.mrdiipo.digicore_banking_app.controller;

import com.mrdiipo.digicore_banking_app.controller.request.CreateAccountRequest;
import com.mrdiipo.digicore_banking_app.controller.request.DepositRequest;
import com.mrdiipo.digicore_banking_app.controller.request.LoginRequest;
import com.mrdiipo.digicore_banking_app.controller.request.WithdrawalRequest;
import com.mrdiipo.digicore_banking_app.controller.response.*;
import com.mrdiipo.digicore_banking_app.exception.AccountDepositException;
import com.mrdiipo.digicore_banking_app.exception.AccountNotFoundException;
import com.mrdiipo.digicore_banking_app.exception.BaseAccountBalanceException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
// Class containing endpoints for the application
public class DigicoreController {

    /*Get Mappings*/

    @GetMapping(path = "/account_info/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public AccountInfoResponse getAccountInfo (@PathVariable ("accountNumber") String accountNumber, HttpServletResponse httpServletResponse) throws AccountNotFoundException {


        return null;
    }

    @GetMapping(path = "/account_statement/{accountNumber}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public AccountStatementResponse getAccountStatement(@PathVariable ("accountNumber") String accountNumber) throws AccountNotFoundException {
        return null;
    }

    /*Post Mappings*/

    @PostMapping(path = "/deposit",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public DepositResponse deposit(@RequestBody DepositRequest depositRequest) throws AccountDepositException, AccountNotFoundException {
        return null;
    }


    @PostMapping(path = "/withdrawal",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public WithdrawalResponse withdrawal(@RequestBody WithdrawalRequest withdrawalRequest) throws AccountNotFoundException, BaseAccountBalanceException {

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
