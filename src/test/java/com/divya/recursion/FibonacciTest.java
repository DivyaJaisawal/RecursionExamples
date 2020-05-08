package com.divya.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldHandleBaseConditionWhenNIsZero() {
        int actualResponse = fibonacci.fib(0);
        assertEquals(0, actualResponse);
    }

    @Test
    public void shouldHandleBaseConditionWhenNIsOne() {
        int actualResponse = fibonacci.fib(1);
        assertEquals(1, actualResponse);
    }

    @Test
    public void shouldReturnNthFibonacciNumber() {
        int actualResponse = fibonacci.fib(5);

        assertEquals(5, actualResponse);
    }
}