package com.divya.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumOfDownloads {
    public static class Download {
        Integer startTime;
        Integer endTime;

        public Download(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return "Download{" +
                    "startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}';
        }
    }

    public int maxDownloads(List<Download> downloadRangeList, int time) {
        int maxTime = Integer.MIN_VALUE;
        List<Download> startDownloadRangeList = new ArrayList<>(downloadRangeList);
        List<Download> endDownloadRangeList = new ArrayList<>(downloadRangeList);

        Collections.sort(startDownloadRangeList, Comparator.comparing(o -> o.startTime));
        Collections.sort(endDownloadRangeList, Comparator.comparing(o -> o.endTime));

        System.out.println(startDownloadRangeList);
        System.out.println(endDownloadRangeList);
        int i = 0, j = 0, counter = 0, countAtTime = 0;

        while (i < startDownloadRangeList.size() && j < endDownloadRangeList.size()) {
            if (countAtTime < counter
                    && time > startDownloadRangeList.get(i).startTime
                    && time < startDownloadRangeList.get(j).endTime) {
                countAtTime = counter;
            }
            if (startDownloadRangeList.get(i).startTime <= endDownloadRangeList.get(j).endTime) {
                i++;
                counter++;
            } else {
                j++;
                counter--;
            }
            maxTime = Math.max(counter, maxTime);
        }
        System.out.println("count time: " + countAtTime);
        return maxTime;
    }
}
