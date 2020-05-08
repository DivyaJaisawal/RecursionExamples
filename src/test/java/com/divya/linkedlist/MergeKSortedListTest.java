package com.divya.linkedlist;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class MergeKSortedListTest {
    private MergeKSortedList mergeKSortedList;

    @Before
    public void setUp() {
        mergeKSortedList = new MergeKSortedList();
    }

    @Test
    public void shouldMergeKSortedList() {
        LinkedList list1 = new LinkedList();
        list1.add(2);
        list1.add(4);
        list1.add(8);
        list1.add(12);
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(5);
        list2.add(9);
        list2.add(16);

        LinkedList[] list = new LinkedList[]{list1, list2};
        LinkedList<Integer> linkedList = mergeKSortedList.mergeKSortedLists(list);
        for (int n : linkedList){
            System.out.println(n);
        }
    }
}