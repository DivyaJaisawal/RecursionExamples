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
        trieNode.insert("a");
        trieNode.insert("aa");
        trieNode.insert("aaa");
        trieNode.insert("aaaa");
        trieNode.insert("aaaaa");
        trieNode.insert("aaaaaa");
        trieNode.insert("aaaaaaa");
        trieNode.insert("aaaaaaaa");
        trieNode.insert("aaaaaaaaa");
        trieNode.insert("aaaaaaaaaa");
        boolean found = trieNode.stringBreaker("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(found);
    }
}