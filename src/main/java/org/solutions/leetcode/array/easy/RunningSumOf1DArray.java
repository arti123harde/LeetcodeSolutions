package org.solutions.leetcode.array.easy;


import org.solutions.leetcode.string.easy.PrintUtil;

/**
 * @author Arti Harde
 */
public class RunningSumOf1DArray {

    public static void main(String[] args) {
        PrintUtil.printArray(runningSum(new int[]{1,2,3,4}));
        PrintUtil.printArray(runningSum(new int[]{1,1,1,1,1}));
        PrintUtil.printArray(runningSum(new int[]{3,1,2,10,1}));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i=0; i< nums.length; i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}