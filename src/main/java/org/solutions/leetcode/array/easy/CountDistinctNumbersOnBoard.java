package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountDistinctNumbersOnBoard {

    public static void main(String[] args) {
        System.out.println(distinctIntegers(5));
    }

    public static int distinctIntegers(int n) {
        if(n == 1) return 0;
        else return n - 1;
    }
}
