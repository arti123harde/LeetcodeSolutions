package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class LargestSubarrayLengthK {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestSubarray(new int[]{1, 4, 5, 2, 3}, 3)));
        System.out.println(Arrays.toString(largestSubarray(new int[]{1, 4, 5, 2, 3}, 4)));
        System.out.println(Arrays.toString(largestSubarray(new int[]{1, 4, 5, 2, 3}, 1)));
    }

    public static int[] largestSubarray(int[] nums, int k) {
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<nums.length-k+1; i++){
            if(maxValue < nums[i]){
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        return Arrays.copyOfRange(nums, maxIndex, maxIndex+k);
    }
}
