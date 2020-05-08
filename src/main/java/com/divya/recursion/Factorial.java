package com.divya.recursion;

/**
 * Mathematical representation
 * n! = n * n-1!
 * n! = 1, if n = 0,1
 **/

public class Factorial {

    public int fact(int n) {
        if (n == 0) return 1;  // base case
        else return n * fact(n - 1);   // recursive case
    }
}
