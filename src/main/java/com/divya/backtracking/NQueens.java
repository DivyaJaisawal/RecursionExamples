package com.divya.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {

    public void nQueensWays() {
        List<List<Integer>> outputList = new ArrayList<>();
        findNQueenWays(outputList, new LinkedList<>(), 0);
        System.out.println(outputList);
        System.out.println(outputList.size());
    }

    private void findNQueenWays(List<List<Integer>> outputList, LinkedList<Integer> tracks, int row) {
        if (tracks.size() == 8) {
            outputList.add(new LinkedList<>(tracks));
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (canPlace(row, i, tracks)) {
                tracks.add(i);
                findNQueenWays(outputList, tracks, row + 1);
                tracks.removeLast();
            }
        }
    }

    private boolean canPlace(int row, int i, LinkedList<Integer> tracks) {
        for (int j = 0; j < tracks.size(); j++) {
            if (row == j || i == tracks.get(j) || Math.abs(row - j) == Math.abs(i - tracks.get(j))) return false;
        }
        return true;
    }
}
