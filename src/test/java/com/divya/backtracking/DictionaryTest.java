package com.divya.backtracking;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DictionaryTest {
    private Dictionary dictionary;

    @Before
    public void setUp() throws Exception {
        dictionary = new Dictionary();
    }

    @Test
    public void shouldPrintLongestChainPossible() {
        HashMap<String, Integer> outputHashmap = dictionary.longestChain(new String[]{"abcd", "bcd", "d", "efgh", "e", "eg","egh"});
        for (Map.Entry<String,Integer> entry : outputHashmap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}