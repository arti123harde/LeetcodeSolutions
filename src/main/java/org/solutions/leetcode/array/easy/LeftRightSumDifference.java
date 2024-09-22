package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.string.easy.PrintUtil;

/**
 * @author Arti Harde
 */
public class LeftRightSumDifference {

    public static void main(String[] args) {
        PrintUtil.printArray(leftRightDifference(new int[]{10,4,8,3}));
        PrintUtil.printArray(leftRightDifference(new int[]{1}));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length-1] = 0;
        for(int i=1, j=nums.length-2; i<nums.length && j>=0 ; i++, j--){
            leftSum[i] = leftSum[i-1] + nums[i-1];
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }
        for(int i=0; i< nums.length; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}