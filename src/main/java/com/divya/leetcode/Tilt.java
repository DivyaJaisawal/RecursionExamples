package com.divya.leetcode;

import com.divya.tree.TreeNode;

public class Tilt {
    int sum = 0;

    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        findTiltUtils(root);
        return sum;
    }

    private int findTiltUtils(TreeNode root) {
        if (root == null) return 0;
        int left = findTiltUtils(root.left);
        int right = findTiltUtils(root.right);
        sum += Math.abs(left - right);
        return left + right + root.data;
    }
}

