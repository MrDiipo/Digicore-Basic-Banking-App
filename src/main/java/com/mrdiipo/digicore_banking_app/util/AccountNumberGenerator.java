package com.mrdiipo.digicore_banking_app.util;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class AccountNumberGenerator {


        private static final Random RANDOM = new SecureRandom();
        private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        public static String generateAccountNumber(int length){
            return generateRandomString(length);
        }

        private static String generateRandomString(int length) {
            StringBuilder returnValue = new StringBuilder(length);

            for (int i = 0; i<length; i++){
                returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
            }
            return new String(returnValue);
    }
}
