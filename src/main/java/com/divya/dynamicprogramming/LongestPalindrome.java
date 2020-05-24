package com.divya.dynamicprogramming;

public class LongestPalindrome {

    public int palindrome(String inputString) {
        int n = inputString.length();
        boolean[][] matrix = new boolean[n][n];
        int max = 1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            matrix[i][i] = true;
        }

        for (int i = 0; i < n-1; i++) {
            if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                matrix[i][i + 1] = true;
                start = i;
                max = 2;
            }
        }

        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (matrix[i + 1][j - 1] && inputString.charAt(i) == inputString.charAt(j)) {
                    matrix[i][j] = true;
                    if (k > max) {
                        start = i;
                        max = k;
                    }
                }
            }
        }

        System.out.println(inputString.substring(start, max + start));
        return max;
    }
}