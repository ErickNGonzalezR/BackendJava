package com.platzi.javatests.util;

public class StringUtil {

    /**
     * Description repeat this function helps us to repeat word
     * @param times int times of repeat
     * @param str String word to repeat
     * */
    public static String repeat(String str, int times) {

        if (times < 0) {
            throw new IllegalArgumentException("negative times not allowed");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str;
        }

        return result;
    }
}
