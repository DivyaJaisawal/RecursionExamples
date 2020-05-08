package com.divya.recursion;

/**
 * Mathematical representation
 * 
 * With O(n) complexity
 * x^n --> x * x^(n-1)
 * x^n --> 1 if n = 0
 *
 * With log(n) complexity
 * x^n --> x^(n/2) * x^(n/2) if n is even
 * x^n --> x * x^(n-1) if n is odd
 * x^n --> 1 if n = 0
 */

public class Power {

    public int pow(int x, int n) {
        if (n == 0) return 1;  // base case
        return x * pow(x, n - 1);   // recursive case
    }

    public int computePowerUsingDivideAndRule(int x, int n) {
        if (n == 0) return 1;
        int y = computePowerUsingDivideAndRule(x, n / 2);
        if (n % 2 == 0) {
            return y * y;
        } else return x * y * y;
    }
}
