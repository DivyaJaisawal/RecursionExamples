package com.divya.recursion;

/**
 * Mathematical representation f(n) = f(n-1)+f(n-2)
 * It starts with 0, 1, 1....
 */

public class Fibonacci {

    public int fib(int n) {
        if (n <= 1) return n;   // base case
        return fib(n - 1) + fib(n - 2);  // recursive case
    }
}