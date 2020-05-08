package com.divya.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    private BinaryTree binaryTree;

    @Before
    public void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    public void shouldPrintTheInorderTraversal() {
        System.out.println("******INORDER TRAVERSAL*******");
        binaryTree.fetchInOrder(createBinaryTree());
    }

    @Test
    public void shouldPrintThePreOrderTraversal() {
        System.out.println("******PRE ORDER TRAVERSAL*******");
        binaryTree.fetchPreOrder(createBinaryTree());
    }

    @Test
    public void shouldPrintPostInorderTraversal() {
        System.out.println("******POST ORDER TRAVERSAL*******");
        binaryTree.fetchPostOrder(createBinaryTree());
    }

    @Test
    public void shouldReturnHeightOfAGivenBinaryTree() {
        int height = binaryTree.calculateHeight(createBinaryTree());
        System.out.println("******HEIGHT OF THE TREE******* " + height);
        assertEquals(3, height);
    }

    @Test
    public void shouldReturnTotalNumberOfLeafNodesOfAGivenBinaryTree() {
        int totalLeafNodes = binaryTree.totalLeafNodes(createBinaryTree());
        System.out.println("******TOTAL LEAF NODES COUNT OF THE TREE******* " + totalLeafNodes);
        assertEquals(4, totalLeafNodes);
    }

    @Test
    public void shouldReturnTrueIfNodeIsPresentInTheTree() {
        boolean isFound = binaryTree.nodePresent(createBinaryTree(), 70);
        assertTrue(isFound);
    }

    @Test
    public void shouldReturnFalseIfNodeIsNotPresentInTheTree() {
        boolean isFound = binaryTree.nodePresent(createBinaryTree(), 90);
        assertFalse(isFound);
    }

    @Test
    public void shouldReturnNodeIfPresent() {
        TreeNode node = binaryTree.findNode(createBinaryTree(), 60);
        assertNotNull(node);
    }

    @Test
    public void shouldReturnNullIfNodeIsNotPresent() {
        TreeNode node = binaryTree.findNode(createBinaryTree(), 90);
        assertNull(node);
    }

    /* Create BinaryTree:
                                  40
                                /    \
                              20      60
                             /  \    /  \
                           10   30  50   70
            */
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