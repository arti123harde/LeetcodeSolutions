package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SumOfDigitsInMinimumNumber {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(new int[]{34,23,1,24,75,33,54,8}));
        System.out.println(sumOfDigits(new int[]{99,77,33,66,55}));
    }

    public static int sumOfDigits(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n : nums) min = Math.min(min, n);
        int sum;
        if(min <= 9) sum = min;
        else if(min <= 99) sum = (min / 10) + (min % 10);
        else return 0;
        if(sum % 2 == 0) return 1; else return 0;
    }
}
