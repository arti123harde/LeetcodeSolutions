package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumOperationsToExceedThresholdValueI {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,11,10,1,3}, 10));
        System.out.println(minOperations(new int[]{1,1,2,4,9}, 1));
    }

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) count++;
        }
        return count;
    }
}