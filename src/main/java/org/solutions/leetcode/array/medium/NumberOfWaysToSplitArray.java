package org.solutions.leetcode.array.medium;

/**
 * @author Arti Harde
 */
public class NumberOfWaysToSplitArray {

    public static void main(String[] args) {
        System.out.println(waysToSplitArray(new int[]{10,4,-8,7}));
    }

    public static int waysToSplitArray(int[] nums) {
        long leftSum = 0;
        long rightSum = 0;
        int count = 0;
        for (int num : nums) rightSum += num;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum)  count++;
        }
        return count;
    }
}
