package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumTotalOperations {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,4,2}));
        System.out.println(minOperations(new int[]{10,10,10}));
    }

    public static int minOperations(int[] nums) {
        int result = 0;
        for (int i=0; i < nums.length-1; i++) if (nums[i] != nums[i + 1]) result++;
        return result;
    }
}
