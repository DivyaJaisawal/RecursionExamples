package com.divya.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {

    public boolean wordBreakUtil(String s, List<String> wordDict) {
        return wordBreakUtilWithDp(s, wordDict, new HashMap<>());
    }

    public boolean wordBreakUtilWithDp(String s, List<String> wordDict, Map<String, Boolean> hashMap) {
        if (s.isEmpty()) return true;
        if (wordDict.contains(s)) return true;

        if (hashMap.containsKey(s)) {
            return hashMap.get(s);
        }

        for (String word : wordDict) {
            hashMap.put(word, true);
            if (s.startsWith(word)) {
                return wordBreakUtilWithDp(s.substring(word.length()), wordDict, hashMap);
            }
        }
        return false;

    }

    public boolean wordBreak4(String s, List<String> wordDict) {
        return wordBreakUtilWithDp(s, wordDict, new HashMap<>());
    }

    public boolean wordBreakUtilWithDp(String s, List<String> wordDict, HashMap<String, Boolean> hashMap) {
        if (s.isEmpty()) {
            return true;
        }
        if (hashMap.containsKey(s)) {
            return hashMap.get(s);
        }

        boolean isPresent = false;
        for (int i = 0; i < s.length(); i++) {
            String part1 = s.substring(0, i + 1);
            String part2 = s.substring(i + 1);
            if (wordDict.contains(part1) && wordBreakUtilWithDp(part2, wordDict, hashMap)) {
                isPresent = true;
                return isPresent;
            }
        }
        hashMap.put(s, isPresent);
        return isPresent;
    }

    // with TLE
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) return true;
        if (wordDict.contains(s)) return true;

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (wordBreak4(s.substring(word.length()), wordDict)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean wordBreak3(String s, List<String> wordDict) {
        Boolean[] isPresent = new Boolean[s.length()];
        return wordUtil(s, 0, wordDict, isPresent);
    }

    public boolean wordUtil(String s, int start, List<String> wordDict, Boolean[] isPresent) {
        if (isPresent[start] != null) {
            return isPresent[start];
        }

        if (wordDict.contains(s)) {
            isPresent[start] = true;
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            String part1 = s.substring(0, i + 1);
            String part2 = s.substring(i + 1);
            if (wordDict.contains(part1) && wordUtil(part2, i + 1, wordDict, isPresent)) {
                isPresent[start] = true;
                return true;
            }
        }
        isPresent[start] = false;
        return false;
    }
}
