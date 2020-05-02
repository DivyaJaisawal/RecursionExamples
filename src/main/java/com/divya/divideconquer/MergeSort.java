package com.divya.divideconquer;

public class MergeSort {
    //5, 9, 12, 13, 13, 18, 21, 3, 3, 5, 10
    public int[] mergeSort(int[] nums, int start, int end) {
        if (nums.length == 0) {
            return null;
        }
        if (start == end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        return merge(nums, start, mid, end);
    }

    private int[] merge(int[] arr, int start, int mid, int end) {
        int i, j, k;
        i = start;
        j = mid + 1;
        k = 0;
        int[] mergedArray = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mergedArray[k++] = arr[i++];
            } else {
                mergedArray[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            mergedArray[k++] = arr[i++];
        }

        while (j <= end) {
            mergedArray[k++] = arr[j++];
        }

        for (i = end; i >= start; i--) {
            arr[i] = mergedArray[--k];
        }

        return mergedArray;
    }
}