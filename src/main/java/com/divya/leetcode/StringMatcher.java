package com.divya.leetcode;

import java.util.Stack;

public class StringMatcher {

    public boolean doMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        return matcher(text, pattern, n, m);
    }

    private boolean matcher(String text, String pattern, int n, int m) {
        for (int i = 0; i < n - m + 1; i++) {
            int j = 0;
            while (j < m && pattern.charAt(j) == text.charAt(i + j)) {
                j++;
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid(String s) {
        char[] values = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char c : values) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(!stack.empty() && c== ')' &&  stack.peek() == '('){
                stack.pop();
            }else if(!stack.empty() && c== '}' &&  stack.peek() == '{')
                stack.pop();
            else if(!stack.empty() && c== ']' &&  stack.peek() == '[')
                stack.pop();
            else
                return false;
        }

        return stack.empty();
    }
}
