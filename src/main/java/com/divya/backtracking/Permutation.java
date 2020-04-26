package com.divya.backtracking;

import java.util.Set;

public class Permutation {

    public void permuteUtil(Set<String> inputList) {
        permute(inputList, "", inputList.size());
    }

    private void permute(Set<String> inputList, String prefix, int totalLength) {
        if (prefix.length() == totalLength) {
            System.out.println(prefix);
            return;
        }

        for (String s : inputList) {
            inputList.remove(s);
            permute(inputList, prefix + s, totalLength);
            inputList.add(s);
        }
    }
}
