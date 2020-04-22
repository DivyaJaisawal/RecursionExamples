package com.divya;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(90, reversedLinkedList.node.data);
        assertEquals(70, reversedLinkedList.node.node.data);
        assertEquals(50, reversedLinkedList.node.node.node.data);
        assertEquals(30, reversedLinkedList.node.node.node.node.data);

    }

    private LinkedListNode createLinkedList() {
        LinkedListNode node5 = new LinkedListNode(100, null);
        LinkedListNode node4 = new LinkedListNode(90, node5);
        LinkedListNode node3 = new LinkedListNode(70, node4);
        LinkedListNode node2 = new LinkedListNode(50, node3);
        LinkedListNode node1 = new LinkedListNode(30, node2);
        return node1;
    }
}