package com.learn.java.learn.pepcoding.pattern;

import java.util.Scanner;

/**
 * url : https://www.pepcoding.com/resources/online-java-foundation/patterns/
 * Pattern1
 * 1. You are given a number n.
 * 2. You've to create a pattern of * and separated by tab as shown in output format.
 *
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        if(n==0){
            throw new IllegalArgumentException("Invalid Input");
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
                if(j+1<=i){
                    System.out.print("\u0009");
                }
            }
            System.out.println();
        }
    }
}
