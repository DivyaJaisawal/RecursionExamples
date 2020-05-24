package com.divya.comparator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumOfDownloadsTest {
    private NumOfDownloads numOfDownloads;

    @Before
    public void setUp() {
        numOfDownloads = new NumOfDownloads();
    }

    @Test
    public void maxDownloads() {
        NumOfDownloads.Download d1 = new NumOfDownloads.Download(2, 4);
        NumOfDownloads.Download d2 = new NumOfDownloads.Download(0, 4);
        NumOfDownloads.Download d3 = new NumOfDownloads.Download(2, 3);
        NumOfDownloads.Download d4 = new NumOfDownloads.Download(1, 2);
        NumOfDownloads.Download d5 = new NumOfDownloads.Download(3, 5);
        List<NumOfDownloads.Download> downloadList = new ArrayList<>();
        downloadList.add(d1);
        downloadList.add(d2);
        downloadList.add(d3);
        downloadList.add(d4);
        downloadList.add(d5);
        int b = numOfDownloads.maxDownloads(downloadList, 2);
        System.out.println(b);
    }
}