package com.divya.leetcode;

import com.divya.tree.TreeNode;

public class SymmetricTree {
    int rightVal = Integer.MIN_VALUE;
    int leftVal = Integer.MIN_VALUE;

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricCheck(root.left, root.right);
    }

    private boolean isSymmetricCheck(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null && n2 != null) return false;
        if (n1 != null && n2 == null) return false;
        if (leftVal == Integer.MIN_VALUE) leftVal = n1.data;
        if (rightVal == Integer.MIN_VALUE) rightVal = n2.data;
        return leftVal == rightVal && isSymmetricCheck(n1.left, n2.right) == isSymmetricCheck(n1.right, n2.left);
    }
}
