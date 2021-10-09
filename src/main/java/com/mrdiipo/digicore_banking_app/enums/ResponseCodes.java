package com.mrdiipo.digicore_banking_app.enums;

import org.springframework.http.HttpStatus;



public enum ResponseCodes {
    SUCCESS(HttpStatus.OK), BAD_REQUEST(HttpStatus.BAD_REQUEST);

    private HttpStatus httpStatus;

    ResponseCodes(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
