package org.solutions.leetcode.array.easy;

import java.util.Arrays;

public class ArrayPartition {

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
        System.out.println(arrayPairSum(new int[]{6,2,6,5,1,2}));
    }

    public static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i+=2){
            result += nums[i];
        }
        return result;
    }
}