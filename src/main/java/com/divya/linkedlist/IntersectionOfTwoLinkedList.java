package com.divya.linkedlist;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {

    public LinkedListNode getIntersectionNode(LinkedListNode node1, LinkedListNode node2) {
        HashSet<LinkedListNode> hashSet = new HashSet<>();
        while (node1 != null) {
            hashSet.add(node1);
            node1 = node1.next;
        }
        while (node2 != null) {
            if (hashSet.contains(node2)) {
                return node2;
            }
            node2 = node2.next;
        }
        return null;
    }
}
