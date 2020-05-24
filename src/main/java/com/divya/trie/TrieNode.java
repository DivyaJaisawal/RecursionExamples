package com.divya.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TrieNode {
    List<TrieNode> node = null;
    boolean isWord;

    public TrieNode() {
        isWord = false;
        node = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            node.add(null);
        }
    }

    public void insert(String word) {
        TrieNode current = this;

        for (int i = 0; i < word.length(); i++) {
            if (current.node.get(word.charAt(i) - 'a') == null) {
                current.node.set(word.charAt(i) - 'a', new TrieNode());
            }
            current = current.node.get(word.charAt(i) - 'a');
        }
        current.isWord = true;
    }

    public boolean isPresent(String word) {
        TrieNode current = this;

        for (int i = 0; i < word.length(); i++) {
            current = current.node.get(word.charAt(i) - 'a');
            if (current == null) {
                return false;
            }
        }
        return current.isWord;
    }

    public boolean stringBreaker(String searchString) {
        StringBuilder sb = new StringBuilder(searchString);
        StringBuilder searchWord = new StringBuilder();
        HashMap<String, Boolean> hashMap = new HashMap<>();
        return findString(sb, searchWord, hashMap);
    }

    private boolean findString(StringBuilder inputString, StringBuilder searchWord, HashMap<String, Boolean> hashMap) {
        if (inputString.length() == 0) {
            return true;
        }
        if (hashMap.containsKey(searchWord)) {
            return hashMap.get(searchWord);
        }

        for (int i = 0; i < inputString.length(); i++) {
            searchWord.append(inputString.charAt(i));
            if (isPresent(searchWord.toString())) {
                inputString = inputString.replace(0, searchWord.length(), "");
                hashMap.put(searchWord.toString(), true);
                if (findString(inputString, new StringBuilder(), hashMap)) {
                    return true;
                }
            }
        }
        return false;
    }
}