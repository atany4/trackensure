package com.trackensure.palindrome;

public class Palindrome {
    public static boolean isPalindrome(Integer inValue) {
        String convertedValue = String.valueOf(inValue);
        return convertedValue.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(convertedValue.replaceAll("\\W", ""))
                        .reverse().toString());
    }
}
