package com.mrdiipo.digicore_banking_app.util;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class AccountNumberGenerator {


        private final Random RANDOM = new SecureRandom();
        private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        public String generateAccountNumber(int length){
            return generateRandomString(length);
        }

        private String generateRandomString(int length) {
            StringBuilder returnValue = new StringBuilder(length);

            for (int i = 0; i<length; i++){
                returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
            }
            return new String(returnValue);
    }
}
