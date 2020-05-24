package com.divya.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListTest {
    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void shouldPrintTheCreatedLinkedList() {
        LinkedListNode head = createLinkedList();
        linkedList.displayLinkedList(head);
    }

    @Test
    public void shouldReverseALinkedList() {
        LinkedListNode reversedLinkedList = linkedList.reverseLinkedList(createLinkedList());
        linkedList.displayLinkedList(reversedLinkedList);

        assertEquals(100, reversedLinkedList.data);
        assertEquals(90, reversedLinkedList.next.data);
        assertEquals(70, reversedLinkedList.next.next.data);
        assertEquals(50, reversedLinkedList.next.next.next.data);
        assertEquals(30, reversedLinkedList.next.next.next.next.data);

    }

    private LinkedListNode createLinkedList() {
        LinkedListNode node5 = new LinkedListNode(100, null);
        LinkedListNode node4 = new LinkedListNode(90, node5);
        LinkedListNode node3 = new LinkedListNode(70, node4);
        LinkedListNode node2 = new LinkedListNode(50, node3);
        LinkedListNode node1 = new LinkedListNode(30, node2);
        return node1;
    }

    private LinkedListNode createLinkedList2() {
        LinkedListNode node5 = new LinkedListNode(120, null);
        LinkedListNode node4 = new LinkedListNode(80, node5);
        LinkedListNode node3 = new LinkedListNode(70, node4);
        LinkedListNode node2 = new LinkedListNode(40, node3);
        LinkedListNode node1 = new LinkedListNode(20, node2);
        return node1;
    }

    private LinkedListNode createLinkedList3() {
        LinkedListNode node5 = new LinkedListNode(170, null);
        LinkedListNode node4 = new LinkedListNode(150, node5);
        LinkedListNode node3 = new LinkedListNode(130, node4);
        LinkedListNode node2 = new LinkedListNode(60, node3);
        LinkedListNode node1 = new LinkedListNode(10, node2);
        return node1;
    }

    @Test
    public void shouldMergeTwoSortedList() {
        LinkedListNode sortedLinkedList = linkedList.mergeTwoWayLists(createLinkedList(), createLinkedList2());
        linkedList.displayLinkedList(sortedLinkedList);
    }

    @Test
    public void shouldMergeKSortedList() {
        LinkedListNode[] lists = new LinkedListNode[]{createLinkedList(), createLinkedList2(), createLinkedList3()};
        LinkedListNode sortedLinkedList = linkedList.mergeKSortedLists(lists);
        linkedList.displayLinkedList(sortedLinkedList);
    }

    @Test
    public void shouldFindIntersectingNode() {
        LinkedListNode intersectionNode = linkedList.getIntersectionNode(createLinkedList4(), createLinkedList5());
        assertNull(intersectionNode);
    }

    private LinkedListNode createLinkedList4() {
        LinkedListNode node5 = new LinkedListNode(4, null);
        LinkedListNode node4 = new LinkedListNode(2, node5);
        LinkedListNode node3 = new LinkedListNode(1, node4);
        LinkedListNode node2 = new LinkedListNode(9, node3);
        LinkedListNode node1 = new LinkedListNode(0, node2);
        return node1;
    }

    private LinkedListNode createLinkedList5() {
        LinkedListNode node3 = new LinkedListNode(4, null);
        LinkedListNode node2 = new LinkedListNode(9, node3);
        LinkedListNode node1 = new LinkedListNode(3, node2);
        return node1;
    }
}