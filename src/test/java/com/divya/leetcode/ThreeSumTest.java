package com.divya.leetcode;

import org.junit.Test;

import java.util.List;

public class ThreeSumTest {
    @Test
    public void testThreeSum() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (List<Integer> num : lists) {
            System.out.println(num);
        }
    }
}