package com.divya.dynamicprogramming;

import org.junit.Before;
import org.junit.Test;

public class LongestPalindromeTest {
    private LongestPalindrome longestPalindrome;

    @Before
    public void setUp() throws Exception {
        longestPalindrome = new LongestPalindrome();
    }

    @Test
    public void findLongestPalindrom() {

        int palindromeSize = longestPalindrome.palindrome("abbbaaaaba");
        System.out.println(palindromeSize);
    }
}