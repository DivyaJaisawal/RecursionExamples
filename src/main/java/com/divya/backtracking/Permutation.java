package com.divya.backtracking;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Permutation {

    public void permuteUtil(Set<String> inputList) {
        permute(inputList, "", inputList.size());
    }

    private void permute(Set<String> inputList, String prefix, int totalLength) {
        if (prefix.length() == totalLength) {
            System.out.println(prefix);
            return;
        }

        for (String s : inputList) {
            inputList.remove(s);
            permute(inputList, prefix + s, totalLength);
            inputList.add(s);
        }
    }

    public List<List<Integer>> permuteWithReturnList(int[] nums) {
        List<List<Integer>> outputList = new ArrayList();
        Set<Integer> input = ConcurrentHashMap.newKeySet();
        for (int n : nums) {
            input.add(n);
        }
        findPermutation(input, outputList, new ArrayList<>(), nums.length);
        return outputList;
    }

    private void findPermutation(Set<Integer> nums, List<List<Integer>> outputList, List<Integer> prefix, int length) {
        if (prefix.size() == length) {
            outputList.add(new ArrayList<>(prefix));
            return;
        }

        for (Integer n : nums) {
            nums.remove(n);
            prefix.add(n);
            findPermutation(nums, outputList, prefix, length);
            nums.add(n);
            prefix.remove(n);
        }
    }

    List<Integer> list = new ArrayList<Integer>();
    StringBuilder result = new StringBuilder();

    public String getPermutation(int n, int k) {

        for(int i = 0; i < n; i++) {
            list.add(i+1);
        }

        int total = 1;
        for(int i = 2; i <= n-1; i++) {
            total *= i;
        }

        return get(n-1, total, k);

    }

    private String get(int n, int interval, int k){

        if(list.size() == 1) {
            result.append(list.get(0));
            return result.toString();
        }
        int index = ((k-1) / interval) % list.size();
        result.append(list.get(index));
        list.remove(index);

        return get(n-1, interval/n, k);

    }
}
