package com.divya;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void shouldReturnFactorialOfAGivenNumber() {
        int actualResponse = factorial.fact(5);

        assertEquals(120, actualResponse);
    }

    @Test
    public void shouldHandleBaseCaseIfNisOne() {
        int actualResponse = factorial.fact(1);

        assertEquals(1, actualResponse);
    }

    @Test
    public void shouldHandleBaseCaseIfNisZero() {
        int actualResponse = factorial.fact(0);

        assertEquals(1, actualResponse);
    }
}