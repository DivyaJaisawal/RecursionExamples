package com.divya.backtracking;

import java.util.HashMap;
import java.util.HashSet;

public class Dictionary {

    public HashMap<String, Integer> longestChain(String[] dictionaryWords) {
        HashMap<String, Integer> longestChain = new HashMap<>();
        HashSet<String> dictionaryHashSet = new HashSet<>();

        for (String word : dictionaryWords) {
            dictionaryHashSet.add(word);
        }
        int maxLength = Integer.MIN_VALUE;
        for (String word : dictionaryWords) {
            maxLength = Math.max(maxLength, 1 + permutationOfInputWord(word, dictionaryHashSet, longestChain));
        }
        System.out.println("Longest chain formed is " + maxLength);
        return longestChain;
    }

    private int permutationOfInputWord(String word, HashSet<String> dictionaryHashSet, HashMap<String, Integer> outputMap) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(i);
            int longestChainCount = 0;
            if (dictionaryHashSet.contains(sb.toString())) {
                longestChainCount += 1 + permutationOfInputWord(sb.toString(), dictionaryHashSet, outputMap);
            }
            max = Math.max(max, longestChainCount);
        }
        outputMap.put(word, max + 1);
        return max;
    }
}
