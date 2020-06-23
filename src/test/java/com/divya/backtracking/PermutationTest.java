package com.divya.backtracking;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
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
    @Test
    public void shouldGetKthPermutation() {
        String permutation = this.permutation.getPermutation(3, 3);
        System.out.println(permutation);
    }

    public boolean isAnagram(String s, String t) {
        char[] text = s.toCharArray();
        char[] pattern = t.toCharArray();
        Arrays.sort(text);
        Arrays.sort(pattern);
        System.out.println(text);
        System.out.println(pattern);
        return Arrays.toString(text).equals(Arrays.toString(pattern));
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray())
                ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}