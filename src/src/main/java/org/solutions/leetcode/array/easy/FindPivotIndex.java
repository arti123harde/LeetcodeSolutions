package org.solutions.leetcode.array.easy;

public class FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }

    public static int pivotIndex(int[] nums) {
        int index = -1;
        int ls = 0;
        int rs = 0;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for(int i=0,j=nums.length-1; i<nums.length && j>=0; i++,j--){
            if(i> 0) leftSum[i] = ls + nums[i-1];
            if(j < nums.length-1) rightSum[j] = rs + nums[j+1];
            ls = leftSum[i];
            rs = rightSum[j];
        }
        for(int k=0; k<nums.length; k++) if(leftSum[k] == rightSum[k]) return k;
        return index;
    }
}
