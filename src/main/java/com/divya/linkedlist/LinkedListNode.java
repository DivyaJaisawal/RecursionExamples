package com.divya.linkedlist;

public class LinkedListNode {
    int data;
    LinkedListNode node;

    public LinkedListNode(int data, LinkedListNode node) {
        this.data = data;
        this.node = node;
    }

    public LinkedListNode() {
    }

    public LinkedListNode(int data) {
        this.data = data;
    }
}
