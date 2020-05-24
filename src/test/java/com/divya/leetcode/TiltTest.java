package com.divya.leetcode;

import com.divya.tree.TreeNode;
import org.junit.Test;

public class TiltTest {

    @Test
    public void findTilt() {
        Tilt tilt = new Tilt();
        TreeNode root = new TreeNode(1);
        TreeNode leftRoot = new TreeNode(2);
        TreeNode rightRoot = new TreeNode(3);
        root.left = leftRoot;
        root.right = rightRoot;
        int tiltRes = tilt.findTilt(root);
        System.out.println(tiltRes);
    }
}