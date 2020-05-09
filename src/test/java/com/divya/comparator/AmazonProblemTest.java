package com.divya.comparator;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AmazonProblemTest {
private AmazonProblem amazonProblem;
    @Before
    public void setUp() {
       amazonProblem = new AmazonProblem();
    }

    @Test
    public void shouldSort() {
        List<String> input = Arrays.asList("Id1 abc def", "Id3 abc dgh", "Id4 623 556", "Id5 145 23ab", "Id6 abb efg", "Id2 abc dgh", "Id5 145 23ab");
        List<String> list = amazonProblem.sort(input);
        System.out.println(list);
    }
}