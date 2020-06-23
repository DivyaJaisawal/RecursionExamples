package com.divya.leetcode;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (hashMap.get(o1) == hashMap.get(o2))
                    return o1.compareTo(o2);
                return hashMap.get(o2) - hashMap.get(o1);
            }
        });

        priorityQueue.addAll(hashMap.keySet());
        for (int i = 0; i < k; i++) {
            if (!priorityQueue.isEmpty()) {
                res.add(priorityQueue.poll());
            }
        }
        return res;
    }


    public List<String> topKFrequentUsingComparator(String[] words, int k) {
        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        List<String> output = new ArrayList<>();
        for (String word : words)
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, hashMap.get(word) + 1);
            }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        Comparator<Map.Entry<String, Integer>> entryComparator = Map.Entry.comparingByValue();
        entryList.sort(entryComparator.reversed());
        int i = 0;
        while (i < k) {
            output.add(entryList.get(i).getKey());
            i++;
        }
        System.out.println(hashMap.values());
        return output;
    }
}
