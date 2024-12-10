package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
    }

    public static int maximumCount(int[] nums) {
        int i = 0;
        while (i< nums.length && nums[i] < 0) i++;
        int j = i;
        while (j< nums.length && nums[j] == 0) j++;
        return Math.max(i, nums.length - j);
    }
}
