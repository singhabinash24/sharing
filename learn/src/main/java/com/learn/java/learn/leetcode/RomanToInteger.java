package com.learn.java.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int result = 0;

        String[] arr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            int previous = map.get(arr[i]);
            int next = -1;
            if (i + 1 < s.length()) {
                next = map.get(arr[i + 1]);
                ;
            }


            if (previous < next) {
                result += next - previous;
                i++;
            } else {
                result += previous;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("VI"));
    }

}
