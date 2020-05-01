package com.divya.backtracking;

import org.junit.Before;
import org.junit.Test;

public class NQueensTest {
    private NQueens nQueens;

    @Before
    public void setUp() {
        nQueens = new NQueens();
    }

    @Test
    public void shouldPrintNQueens() {
        nQueens.nQueensWays();
    }
}