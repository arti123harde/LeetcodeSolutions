package org.solutions.leetcode.array.easy;


import org.solutions.leetcode.common.PrintUtil;

/**
 * @author Arti Harde
 */
public class BitwiseOROfAdjacentElements {

    public static void main(String[] args) {
        PrintUtil.printArray(orArray(new int[]{1,3,7,15}));
        PrintUtil.printArray(orArray(new int[]{8,4,2}));
        PrintUtil.printArray(orArray(new int[]{5,4,9,11}));
    }

    public static int[] orArray(int[] nums) {
        int[] result = new int[nums.length-1];
        for(int i=0; i< nums.length-1; i++){
            result[i] = nums[i] | nums[i+1];
        }
        return result;
    }
}