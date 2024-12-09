package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FindGreatestCommonDivisorOfArray {

    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{2,5,6,9,10}));
        System.out.println(findGCD(new int[]{7,5,6,8,3}));
    }

    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)  min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        return gcd(max, min);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
