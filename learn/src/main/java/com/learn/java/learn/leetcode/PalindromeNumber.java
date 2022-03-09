package com.learn.java.learn.leetcode;

/**
 * 9 - Palindrome Number
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * For example, 121 is a palindrome while 123 is not.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int p = 0;
        int t = x;
        while (!(t == 0)) {
            int r = t % 10;
            t = t / 10;

            p = p * 10 + r;
        }
        return p == x;
    }

    public static boolean isPalindrome1(int x) {
        String s = "" + x;
        String sb = new StringBuilder(s).reverse().toString();
        return s.equals(sb);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome1(121));
    }
}
