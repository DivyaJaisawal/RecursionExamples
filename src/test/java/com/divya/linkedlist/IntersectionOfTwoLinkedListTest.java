package com.divya.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class IntersectionOfTwoLinkedListTest {
    private IntersectionOfTwoLinkedList intersectionOfTwoLinkedList;

    @Before
    public void setUp() throws Exception {
        intersectionOfTwoLinkedList = new IntersectionOfTwoLinkedList();
    }

    @Test
    public void shouldFindIntersectingNode() {
        LinkedListNode intersectionNode = intersectionOfTwoLinkedList.getIntersectionNode(createLinkedList1(), createLinkedList2());
        assertNull(intersectionNode);
    }

    private LinkedListNode createLinkedList1() {
        LinkedListNode node5 = new LinkedListNode(4, null);
        LinkedListNode node4 = new LinkedListNode(2, node5);
        LinkedListNode node3 = new LinkedListNode(1, node4);
        LinkedListNode node2 = new LinkedListNode(9, node3);
        LinkedListNode node1 = new LinkedListNode(0, node2);
        return node1;
    }

    private LinkedListNode createLinkedList2() {
        LinkedListNode node3 = new LinkedListNode(4, null);
        LinkedListNode node2 = new LinkedListNode(2, node3);
        LinkedListNode node1 = new LinkedListNode(3, node2);
        return node1;
    }
}
