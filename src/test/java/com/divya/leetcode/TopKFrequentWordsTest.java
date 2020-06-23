package com.divya.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TopKFrequentWordsTest {
    @Test
    public void shouldReturnTopFrequentWords() {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        List<String> words = topKFrequentWords.topKFrequentUsingComparator(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
        System.out.println(words);
    }

    @Test
    public void test() {
        String shell = "shallow";
        char[] shallow = shell.toCharArray();
        Arrays.sort(shallow);
        System.out.println(String.valueOf(shallow));
    }


}