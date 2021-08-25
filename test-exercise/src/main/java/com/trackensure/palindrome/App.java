package com.trackensure.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input integer number:");
        String value = reader.readLine();
        System.out.printf("Input value k = %s" + "%n", value);
        try {
            final boolean result = Palindrome.isPalindrome(Integer.valueOf(value));
            System.out.printf("return: %b%n", result);
        } catch (Exception e) {
            System.out.println("Input number is not integer, please try again.\n");
        }
    }
}
