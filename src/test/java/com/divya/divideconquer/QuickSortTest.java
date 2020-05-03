package com.divya.divideconquer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class QuickSortTest {
    private QuickSort quickSort;

    @Before
    public void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    public void shouldSortGivenListUsingQuickSort() {
        int[] actualArray = {10, 9, 8, 6, 13, 5, 4};

        quickSort.quickSort(actualArray, 0, actualArray.length - 1);

        int [] expectedArray ={4, 5, 6, 8, 9, 10, 13};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldSortGivenListUsingOptimisedQuickSort() {
        int[] actualArray = {3, 6, 7, 4, 12, 8, 10, 9, 8, 6, 13, 5, 4, 3};

        quickSort.optimisedQuickSort(actualArray, 0, actualArray.length - 1);

        int[] expectedArray = {3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10 ,12 ,13};
        assertArrayEquals(expectedArray, actualArray);
    }
}