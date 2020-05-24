package com.divya.linkedlist;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class MergeKSortedList<T> {

    public LinkedList mergeKSortedLists(LinkedList<Integer>[] lists) {
        LinkedList outputList = new LinkedList();
        PriorityQueue<Object> priorityQueue = new PriorityQueue<>();
        for (LinkedList list : lists) {
            for (int i = 0; i < list.size(); i++) {
                priorityQueue.add(list.get(i));
            }
        }
        while (!priorityQueue.isEmpty()) {
            outputList.add(priorityQueue.poll());
        }
        return outputList;
    }

    public LinkedListNode mergeKSortedCustomLinkedLists(LinkedListNode[] lists) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (LinkedListNode list : lists) {
            while (list != null) {
                priorityQueue.add(list.data);
                list = list.next;
            }
        }
        LinkedListNode result = new LinkedListNode(-1);
        LinkedListNode head = result;

        while (!priorityQueue.isEmpty()) {
            head.next = new LinkedListNode(priorityQueue.remove());
            head = head.next;
        }
        return result.next;
    }
}
