package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MaximumSumWithExactlyKElements {

    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[]{1,2,3,4,5}, 3));
        System.out.println(maximizeSum(new int[]{5,5,5}, 2));
    }

    public static int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int j : nums) max = Math.max(max, j);
        int sum = 0;
        while(k > 0){
            sum += max;
            max++;
            k--;
        }
        return sum;
    }
}
