package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

/**
 * @author Arti Harde
 */
public class ConcatenationOfArray {

    public static void main(String[] args) {
        PrintUtil.printArray(getConcatenation(new int[]{1,2,1}));
        PrintUtil.printArray(getConcatenation(new int[]{1,3,2,1}));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
//        for(int i=0; i< nums.length; i++){
//            result[i] = nums[i];
//            result[i+ nums.length] = nums[i];
//        }

        System.arraycopy(nums,0, result, 0, nums.length);
        System.arraycopy(nums,0, result, nums.length, nums.length);
        return result;
    }
}