package com.divya.trie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TrieNodeTest {
    private TrieNode trieNode;

    @Before
    public void setUp() throws Exception {
        trieNode = new TrieNode();
    }

    @Test
    public void shouldReturnTrueIfWordIsPresent() {
        trieNode.insert("abcd");
        trieNode.insert("efgh");
        trieNode.insert("abc");
        trieNode.insert("efga");

        boolean isPresent = trieNode.isPresent("efgh");
        assertTrue(isPresent);
    }

    @Test
    public void shouldReturnWordBreak() {
        trieNode.insert("cats");
        trieNode.insert("an");
        trieNode.insert("dogs");
        trieNode.insert("efga");

        boolean found = trieNode.stringBreaker("efgadogsdogs");
        System.out.println(found);
    }
}