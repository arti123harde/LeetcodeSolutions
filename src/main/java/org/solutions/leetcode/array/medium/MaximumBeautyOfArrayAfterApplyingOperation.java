package org.solutions.leetcode.array.medium;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MaximumBeautyOfArrayAfterApplyingOperation {

    public static void main(String[] args) {
        System.out.println(maximumBeauty(new int[]{4,6,1,2}, 2));
        System.out.println(maximumBeauty(new int[]{1,1,1,1}, 10));
    }

    public static int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        int j = 0;
        for (int i=0; i<nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= 2 * k) j++;
            max = Math.max(max, j - i);
        }
        return max;
    }
}
