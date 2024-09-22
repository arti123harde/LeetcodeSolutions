package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MinimumAverageOfSmallestAndLargestElements {

    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
        System.out.println(minimumAverage(new int[]{1,9,8,3,10,5}));
        System.out.println(minimumAverage(new int[]{1,2,3,7,8,9}));
    }

    public static double minimumAverage(int[] nums) {
        double average = Integer.MAX_VALUE;
        int len = nums.length;;
        Arrays.sort(nums);
        for(int i=0; i<len; i++){
            double sum = (double) (nums[i] + nums[len - i - 1]) / 2 ;
            average = Math.min(average, sum);
        }
        return average;
    }
}