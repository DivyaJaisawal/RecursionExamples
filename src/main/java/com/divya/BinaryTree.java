package com.divya;

public class BinaryTree {

    public void fetchInOrder(TreeNode node) {
        if (node == null) return;
        fetchInOrder(node.left);
        System.out.println(node.data);
        fetchInOrder(node.right);
    }

    public void fetchPostOrder(TreeNode node) {
        if (node == null) return;
        fetchPostOrder(node.left);
        fetchPostOrder(node.right);
        System.out.println(node.data);
    }

    public void fetchPreOrder(TreeNode node) {
        if (node == null) return;
        System.out.println(node.data);
        fetchPreOrder(node.left);
        fetchPreOrder(node.right);
    }
}
