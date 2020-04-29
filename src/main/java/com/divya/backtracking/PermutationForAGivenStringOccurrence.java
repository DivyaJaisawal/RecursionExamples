package com.divya.backtracking;

import java.util.*;

public class PermutationForAGivenStringOccurrence {
    private static final String EMPTY_PREFIX_STRING = "";

    public void permuteAStringWithGivenCharValueAndItsOccurrence(Map<Character, Integer> inputMap) {
        List<String> output = new ArrayList<>();
        int length = 0;
        for (Map.Entry<Character, Integer> map : inputMap.entrySet()) {
            length += map.getValue();
        }
        permuteList(output, inputMap, EMPTY_PREFIX_STRING, length);
    }

    private void permuteList(List<String> outputList, Map<Character, Integer> inputMap,
                             String prefix, int totalLength) {
        if (prefix.length() == totalLength) {
            outputList.add(prefix);
            System.out.println(prefix);
            return;
        }

        for (Character ch : inputMap.keySet()) {
            if (inputMap.get(ch) == 0)
                continue;
            inputMap.put(ch, inputMap.get(ch) - 1);
            permuteList(outputList, inputMap, prefix + ch, totalLength);
            inputMap.put(ch, inputMap.get(ch) + 1);
        }
    }
}
