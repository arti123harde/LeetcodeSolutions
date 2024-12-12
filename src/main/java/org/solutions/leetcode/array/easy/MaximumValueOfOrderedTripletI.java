package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MaximumValueOfOrderedTripletI {

    public static void main(String[] args) {
        System.out.println(maximumTripletValue(new int[]{1000000,1,1000000}));
    }

    public static long maximumTripletValue(int[] nums) {
        long max = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j< nums.length-1; j++){
                for(int k=j+1; k< nums.length; k++)  max = Math.max(max, ((long) (nums[i] - nums[j]) * nums[k]));
            }
        }
        return max;
    }
}