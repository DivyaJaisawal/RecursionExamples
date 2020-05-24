package com.divya.leetcode;

import com.divya.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        levelOrderUtils(root, output, 0);
        Collections.reverse(output);
        return output;

    }

    private void levelOrderUtils(TreeNode root, List<List<Integer>> output, int level) {
        if (root == null) return;
        if (level == output.size()) {
            output.add(new ArrayList<>());
        }
        output.get(level).add(root.data);
        levelOrderUtils(root.left, output, level + 1);
        levelOrderUtils(root.right, output, level + 1);
    }
}
