package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class MaximumAscendingSubarraySum {

    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{3,6,10,1,8,9,9,8,9}));
        System.out.println(maxAscendingSum(new int[]{60}));
        System.out.println(maxAscendingSum(new int[]{10,20,30,5,10,50}));
        System.out.println(maxAscendingSum(new int[]{10,20,30,40,50}));
        System.out.println(maxAscendingSum(new int[]{12,17,15,13,10,11,12}));
    }

    public static int maxAscendingSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length-1; i++){
            sum += nums[i];
            if(nums[i] >= nums[i+1]){
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }
        }
        if(nums[nums.length-1] > nums[nums.length-2]) sum += nums[nums.length-1];
        return Math.max(maxSum, sum);
    }
}
