package org.solutions.leetcode.array.easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1,2,3}));
        System.out.println(maximumProduct(new int[]{1,2,3,4}));
        System.out.println(maximumProduct(new int[]{-1,-2,-3}));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n-1], nums[n-3] * nums[n-2] * nums[n-1]);
    }
}
