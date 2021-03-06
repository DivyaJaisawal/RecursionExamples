package com.divya.leetcode;

import com.divya.tree.TreeNode;
import org.junit.Test;

public class UnivalTreeTest {

    @Test
    public void shouldReturnIfTreeIsUnialuedOrNot() {
        UnivalTree univalTree = new UnivalTree();
        boolean isUnivalTree = univalTree.isUnivalTree(createBinaryTree());
        System.out.println(isUnivalTree);
    }

    private TreeNode createBinaryTree() {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(30);
        TreeNode node4 = new TreeNode(40);
        TreeNode node5 = new TreeNode(50);
        TreeNode node6 = new TreeNode(60);
        TreeNode node7 = new TreeNode(70);

        TreeNode root = node4;
        root.left = node2;
        root.left.left = node1;
        root.left.right = node3;
        root.right = node6;
        root.right.left = node5;
        root.right.right = node7;
        return root;
    }

}