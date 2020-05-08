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
}
