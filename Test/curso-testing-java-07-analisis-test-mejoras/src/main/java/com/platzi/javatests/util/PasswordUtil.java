package com.platzi.javatests.util;

public class PasswordUtil {

    /**
     * Definition: This function shows three levels of security of our password
     * */
    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    /**
     * Definition: This function helps us to see if the level password is strong , medium or weak
     *
     * */
    public static SecurityLevel assessPassword(String password) {

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
