package com.divya.backtracking;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class PermutationTest {
    private Permutation permutation;

    @Before
    public void setUp() {
        permutation = new Permutation();
    }

    @Test
    public void shouldPrintPermutedListByInvokingPermuteWithReturnList() {
        List<List<Integer>> lists = permutation.permuteWithReturnList(new int[]{1, 2, 3});
        for (List<Integer> list : lists){
            System.out.println(list);
        }
    }

    @Test
    public void shouldPrintPermutedListByInvokingPermuteUtils() {
        Set<String> inputSet = ConcurrentHashMap.newKeySet();
        inputSet.add("1");
        inputSet.add("2");
        inputSet.add("3");
        permutation.permuteUtil(inputSet);
    }
}