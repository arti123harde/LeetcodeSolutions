package org.solutions.leetcode.array.easy;

public class LongestContinuousIncreasingSubsequence {

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1,3,5,7}));
        System.out.println(findLengthOfLCIS(new int[]{1,3,5,4,7}));
        System.out.println(findLengthOfLCIS(new int[]{2,2,2,2,2}));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int maxLength = 0;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] < nums[i]) count++;
            else {
                maxLength = Math.max(count, maxLength);
                count = 1;
            }
        }
        return Math.max(count, maxLength);
    }
}
