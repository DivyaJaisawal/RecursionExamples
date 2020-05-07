package com.divya;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedCustomListTest {
    private MergeKSortedCustomList mergeKSortedCustomList;

    @Before
    public void setUp() throws Exception {
        mergeKSortedCustomList = new MergeKSortedCustomList();
    }

    @Test
    public void shouldMergeKSortedList() {
       List list1 = new ArrayList();
        list1.add(2);
        list1.add(4);
        list1.add(8);
        list1.add(12);
       List list2 = new ArrayList();
        list2.add(1);
        list2.add(5);
        list2.add(9);
        list2.add(16);
        List<Integer>[] listOfList = new List[]{list1, list2};
        List<Integer> outputList = mergeKSortedCustomList.mergeSortedList(listOfList);

        for (int n : outputList){
            System.out.println(n);
        }
    }
}