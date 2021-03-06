package com.mrdiipo.digicore_banking_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public final class User {

    private Long Id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int phoneNumber;
    private String email;
    private String occupation;
    private List<String> Address;
    private List<Account> accounts;

    // Other details about the user ca be added here

}
