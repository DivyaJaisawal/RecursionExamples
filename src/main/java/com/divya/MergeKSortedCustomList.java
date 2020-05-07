package com.divya;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedCustomList {

    public List mergeSortedList(List<Integer>[] inputLists) {
        CustomInput customInput;
        List<Integer> outputList = new ArrayList<>();
        int[] indexes = new int[inputLists.length];

        PriorityQueue<CustomInput> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            if (o1.inputValue < o2.inputValue)
                return -1;
            if (o1.inputValue > o2.inputValue) return 1;
            return 0;
        });

        for (int i = 0; i < inputLists.length; i++) {
            CustomInput e = new CustomInput(i, inputLists[i].get(0));
            priorityQueue.add(e);
            indexes[i]++;
        }

        while (!priorityQueue.isEmpty()) {
            customInput = priorityQueue.poll();
            outputList.add(customInput.inputValue);
            if (inputLists[customInput.index].size() != indexes[customInput.index]) {
                int inputValue = inputLists[customInput.index].get(indexes[customInput.index]);
                priorityQueue.add(new CustomInput(customInput.index, inputValue));
                indexes[customInput.index]++;
            }
        }
        return outputList;
    }
}
