package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MinimumNumberGame {

    public static void main(String[] args) {
        PrintUtil.printArray(numberGame(new int[]{5,4,2,3}));
        PrintUtil.printArray(numberGame(new int[]{2,5}));
    }

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i=i+2){
            result[i] = nums[i+1];
            result[i+1] = nums[i];
        }
        return result;
    }
}