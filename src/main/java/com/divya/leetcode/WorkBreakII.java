package com.divya.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkBreakII {
    // pineapplepenapple , pine +com(applepenapple)
    // applepenapple , apple + com(penapple)
    // penapple, pen +com(apple)
    // "pineapplepenapple", Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"

    public List<String> wordBreak(String s, List<String> wordDict) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        formSentences(s, wordDict, hashMap);
        return hashMap.get(s);
    }
    private void formSentences(String s, List<String> wordDictionary,
                               HashMap<String, List<String>> hashMap) {

        if (hashMap.containsKey(s)) {
            return;
        }

        if (s.isEmpty()) return;
        List<String> currentWordList = new ArrayList<>();

        if (wordDictionary.contains(s)) {
            currentWordList.add(s);
        }

        for (int i = 0; i < s.length(); i++) {
            String part1 = s.substring(0, i + 1);
            String part2 = s.substring(i + 1);
            if (wordDictionary.contains(part1)) {
                System.out.println("part1"+ part1);
                System.out.println("part2"+ part2);
                if (part2.isEmpty()) continue;
                formSentences(part2, wordDictionary, hashMap);
                for (String outputStr : hashMap.get(part2)) {
                    String formattedStr = part1 + " " + outputStr;
                    currentWordList.add(formattedStr);
                }
            }
        }
        System.out.println("currentWordList " + currentWordList);
        hashMap.put(s, currentWordList);
    }
}

