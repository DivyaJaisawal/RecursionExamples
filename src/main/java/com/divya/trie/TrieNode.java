package com.divya.trie;

import java.util.ArrayList;
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
        Boolean isPresent = false;
        StringBuilder sb = new StringBuilder(searchString);
        StringBuilder searchWord = new StringBuilder();
        return findString(sb, searchWord, isPresent);
    }

    private boolean findString(StringBuilder inputString, StringBuilder searchWord, Boolean isPresent) {
        if (inputString.length() == 0) {
            return true;
        }
        for (int i = 0; i < inputString.length(); i++) {
            searchWord.append(inputString.charAt(i));
            if (isPresent(searchWord.toString())) {
                inputString = inputString.replace(0, searchWord.length(), "");
                if (findString(inputString, new StringBuilder(), isPresent)) {
                    return true;
                }
            }
        }
        return false;
    }
}