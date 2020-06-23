package com.divya.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * HEAD
 * |A| -> |B| -> |C| -> |D| -> |E| -> NULL  -- Input list
 * <p>
 * <p>
 * HEAD
 * |A| |E| -> |D| -> |C| -> |B| -> NULL (A points to B)
 * |------------------------^
 * <p>
 * HEAD
 * |E| -> |D| -> |C| -> |B| <-> |A|
 * <p>
 * <p>
 * HEAD
 * |E| -> |D| -> |C| -> |B| -> |A| -> NULL
 * <p>
 * <p>
 * HEAD
 * |E| -> |D| -> |C| -> |B| -> |A| -> NULL   -- output list
 */

public class LinkedList {
    public void displayLinkedList(LinkedListNode node) {
        if (node == null) return; // base cases
        System.out.println("---------------------------------------------------");
        System.out.println("data: " + node.data + "  next: " + node.next);
        displayLinkedList(node.next);  // recursive case
    }

    public LinkedListNode reverseLinkedList(LinkedListNode head) {
        if (head == null || head.next == null) return head; // base cases
        LinkedListNode newLinkedList = reverseLinkedList(head.next); // recursive case
        head.next.next = head;
        head.next = null;
        return newLinkedList;
    }

    public LinkedListNode mergeTwoWayLists(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode l3 = new LinkedListNode();
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.data <= l2.data) {
            l3.data = l1.data;
            l1 = l1.next;
        } else {
            l3.data = l2.data;
            l2 = l2.next;
        }
        LinkedListNode start = l3;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                l3.next = new LinkedListNode(l1.data);
                l3 = l3.next;
                l1 = l1.next;
            } else {
                l3.next = new LinkedListNode(l2.data);
                l3 = l3.next;
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            l3.next = new LinkedListNode(l1.data);
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            l3.next = new LinkedListNode(l2.data);
            l3 = l3.next;
            l2 = l2.next;
        }
        return start;
    }

    public LinkedListNode mergeKSortedLists(LinkedListNode[] lists) {
        LinkedListNode mergedList = lists[0];

        for (LinkedListNode node : lists) {
            mergedList = mergeTwoWayLists(mergedList, node);
        }
        return mergedList;
    }


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

    // 10 -> 60 -> 130 ->150 ->170
    public LinkedListNode reverse(LinkedListNode head) {
        if (head == null || head.next == null) return head;
        LinkedListNode temp1 = head;
        LinkedListNode temp2 = head.next;
        head = reverse(head.next);
        temp2.next = temp1;
        temp1.next = null;
        return head;
    }
    
    // 20 -> 40 -> 70 ->80 ->120
    public boolean hasCycle(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }

    //20 -> 40 -> 70 -->70 ->80 ->20
    public boolean isPalindrome(LinkedListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.data);
            head = head.next;
        }
        return palindromeUtils(nums, 0, nums.size() - 1);
    }

    private boolean palindromeUtils(List<Integer> nums, int start, int end) {
        if (start >= end) return true;
        return nums.get(start) == nums.get(end) && palindromeUtils(nums, start + 1, end - 1);
    }
}