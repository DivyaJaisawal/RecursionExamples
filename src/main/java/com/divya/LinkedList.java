package com.divya;

/**
 * HEAD
 * |A| -> |B| -> |C| -> |D| -> |E| -> NULL  -- Input list
 *
 *
 * HEAD
 * |A| |E| -> |D| -> |C| -> |B| -> NULL (A points to B)
 *  |------------------------^
 *
 *                             HEAD
 * |E| -> |D| -> |C| -> |B| <-> |A|
 *
 *
 *                             HEAD
 * |E| -> |D| -> |C| -> |B| -> |A| -> NULL
 *
 *
 * HEAD
 * |E| -> |D| -> |C| -> |B| -> |A| -> NULL   -- output list
 *
 */

public class LinkedList {
    public void displayLinkedList(LinkedListNode node) {
        if (node == null) return; // base cases
        System.out.println("---------------------------------------------------");
        System.out.println("data: " + node.data + "  next: " + node.node);
        displayLinkedList(node.node);  // recursive case
    }

    public LinkedListNode reverseLinkedList(LinkedListNode head) {
        if (head == null || head.node == null) return head; // base cases
        LinkedListNode newLinkedList = reverseLinkedList(head.node); // recursive case
        head.node.node = head;
        head.node = null;
        return newLinkedList;
    }
}
