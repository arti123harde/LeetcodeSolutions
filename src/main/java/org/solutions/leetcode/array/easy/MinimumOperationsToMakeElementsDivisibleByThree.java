package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumOperationsToMakeElementsDivisibleByThree {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,2,3,4}));
        System.out.println(minimumOperations(new int[]{3,6,9}));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 3 != 0) count++;
        }
        return count;
    }
}