package com.divya.leetcode;

import com.divya.tree.TreeNode;

public class UnivalTree {
    int val = Integer.MIN_VALUE;

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        if (val == Integer.MIN_VALUE) {
            val = root.data;
        }
        return val == root.data && (isUnivalTree(root.left) && isUnivalTree(root.right));
    }
}
