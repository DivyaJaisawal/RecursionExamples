package com.divya.backtracking;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PermutationForAGivenStringOccurrenceTest {
    private PermutationForAGivenStringOccurrence permutationForAGivenStringOccurrence;

    @Before
    public void setUp() {
        permutationForAGivenStringOccurrence = new PermutationForAGivenStringOccurrence();
    }

    @Test
    public void shouldPrintPermutedStringOfGivenCharsAndOccurrence() {

        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('a', 3);
        hashMap.put('b', 2);
        permutationForAGivenStringOccurrence.permuteAStringWithGivenCharValueAndItsOccurrence(hashMap);
    }

}