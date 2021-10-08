package com.mrdiipo.digicore_banking_app.controller;

import com.mrdiipo.digicore_banking_app.controller.request.CreateAccountRequest;
import com.mrdiipo.digicore_banking_app.controller.request.DepositRequest;
import com.mrdiipo.digicore_banking_app.controller.request.LoginRequest;
import com.mrdiipo.digicore_banking_app.controller.request.WithdrawalRequest;
import com.mrdiipo.digicore_banking_app.controller.response.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
// Class containing endpoints for the application
public class DigicoreController {

    /*Get Mappings*/

    @GetMapping("/account_info/{accountNumber}")
    public AccountInfoResponse getAccountInfo(@PathVariable String accountNumber, HttpServletResponse httpServletResponse){

        return null;
    }

    @GetMapping("/account_statement/{accountNumber}")
    public AccountStatementResponse getAccountStatement(@PathVariable String accountNumber){
        return null;
    }

    /*Post Mappings*/

    @PostMapping("/deposit")
    public DepositResponse deposit(@RequestBody DepositRequest depositRequest){
        return null;
    }


    @PostMapping("/withdrawal")
    public WithdrawalResponse withdrawal(@RequestBody WithdrawalRequest withdrawalRequest){
        return null;
    }

    @PostMapping("/create_account")
    public CreateAccountResponse createAccount(@RequestBody CreateAccountRequest createAccountRequest){
        return null;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return null;
    }


}
