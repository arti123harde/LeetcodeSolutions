package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class LongestAlternatingSubarray {

    public static void main(String[] args) {
        System.out.println(alternatingSubarray(new int[]{2,3,4,3,4}));
        System.out.println(alternatingSubarray(new int[]{4,5,6}));
    }

    public static int alternatingSubarray(int[] nums) {
        int count = 1;
        int max = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] - nums[i-1] == (count % 2 == 0 ? - 1: 1))  max = Math.max(++count, max);
            else if(nums[i] - nums[i-1] == 1) count = 2;
            else count = 1;
        }
        return max > 1 ? max : -1;
    }
}
