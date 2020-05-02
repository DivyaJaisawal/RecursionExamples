package com.divya.divideconquer;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {
    private MergeSort mergeSort;

    @Before
    public void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    public void shouldSplitTheArrayOfNumbs() {
        int[] inputList = {5, 9, 12, 13, 13, 18, 21, 3, 3, 5, 10};
        int[] nums = mergeSort.mergeSort(inputList, 0, inputList.length - 1);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}