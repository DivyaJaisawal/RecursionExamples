package com.divya.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringMatcherTest {

    @Test
    public void shouldReturnTrueIfStringMatches() {
        StringMatcher stringMatcher = new StringMatcher();
        boolean doesMatch = stringMatcher.doMatch("apple", "le");
        assertTrue(doesMatch);
    }

    @Test
    public void text() {
        StringMatcher stringMatcher = new StringMatcher();
        boolean b = stringMatcher.isValid("[");
        System.out.println(b);
    }
}