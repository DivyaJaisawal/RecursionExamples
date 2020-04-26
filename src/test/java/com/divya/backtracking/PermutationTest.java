package com.divya.backtracking;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class PermutationTest {
    private Permutation permutation;

    @Before
    public void setUp() {
        permutation = new Permutation();
    }

    @Test
    public void shouldPrintPermutedList() {
        Set<String> inputSet = ConcurrentHashMap.newKeySet();
        inputSet.add("1");
        inputSet.add("2");
        inputSet.add("3");
        inputSet.add("4");

        permutation.permuteUtil(inputSet);
    }
}