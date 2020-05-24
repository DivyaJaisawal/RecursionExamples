package com.divya.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordBreakTest {
    private WordBreak wordBreak;

    @Before
    public void setUp() {
        wordBreak = new WordBreak();
    }

    @Test
    public void shouldReturnTrueIfStringBreaksAreFoundInDictionary() {
        boolean wordBreak = this.wordBreak.wordBreak4("dogsefgaandogsdogs", Arrays.asList("cats", "an", "dogs", "efga"));
        assertTrue(wordBreak);
    }

    @Test
    public void shouldHandleTimeLimitExceeded() {
        boolean wordBreak = this.wordBreak.wordBreak4("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
                , Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        assertFalse(wordBreak);
    }

    @Test
    public void shouldHandleTimeLimitExceeded1() {
        boolean wordBreak = this.wordBreak.wordBreakUtil(""
                , Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaab"));
        assertTrue(wordBreak);
    }
}