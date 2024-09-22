package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.utils.PrintUtil;

/**
 * @author Arti Harde
 */
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        PrintUtil.printArray(buildArray(new int[]{0,2,1,5,3,4}));
        PrintUtil.printArray(buildArray(new int[]{5,0,1,2,3,4}));
    }

    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i=0; i< nums.length; i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }

}