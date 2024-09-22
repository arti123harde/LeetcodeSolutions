package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MaximumProductOfTwoElementsInAnArray {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
        System.out.println(maxProduct(new int[]{1,5,4,5}));
        System.out.println(maxProduct(new int[]{3,7}));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1] - 1) * (nums[nums.length-2] - 1);
    }
}