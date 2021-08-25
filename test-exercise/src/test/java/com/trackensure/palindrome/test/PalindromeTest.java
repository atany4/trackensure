package com.trackensure.palindrome.test;

import com.trackensure.palindrome.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void shouldReturnTrue() {
        Integer value = 323;
        final boolean actual = true;
        final boolean expexted = Palindrome.isPalindrome(value);
        Assert.assertEquals(expexted, actual);
    }

    @Test
    public void shouldReturnFalse() {
        Integer value = -45;
        final boolean actual = false;
        final boolean expexted = Palindrome.isPalindrome(value);
        Assert.assertEquals(expexted, actual);
    }
}
