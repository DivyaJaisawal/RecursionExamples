package com.divya.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WorkBreakIITest {
    private WorkBreakII workBreakII;

    @Before
    public void setUp() throws Exception {
        workBreakII = new WorkBreakII();
    }

    @Test
    public void shouldReturnListOfCombinationsOfReusingWord() {
        List<String> wordBreak = workBreakII.wordBreak("pineapplepenapple", Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        System.out.println(wordBreak);
    }
}