package com.divya.divideconquer;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    int partition(int arr[], int start, int end) {
        if (start >= end) {
            return start;
        }
        int pivot = arr[end];
        List<Integer> smallerElement = new ArrayList();
        List<Integer> largerElement = new ArrayList();
        for (int i = start; i < end; i++) {
            if (arr[i] > pivot) {
                largerElement.add(arr[i]);
            } else {
                smallerElement.add(arr[i]);
            }
        }
        int j = start;
        for (int n : smallerElement) {
            arr[j++] = n;
        }

        int pivotIndex = j;
        arr[j++] = pivot;

        for (int n : largerElement) {
            arr[j++] = n;
        }
        return pivotIndex;
    }

    int optimisedPartitioning(int[] arr, int start, int end) {
        int i = start - 1;
        int j = start;
        int pivot = arr[end];
        while (j < end) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = partition(arr, start, end);
        quickSort(arr, start, mid - 1);
        quickSort(arr, mid + 1, end);
    }

    void optimisedQuickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = optimisedPartitioning(arr, start, end);
        optimisedQuickSort(arr, start, mid - 1);
        optimisedQuickSort(arr, mid + 1, end);
    }
}
