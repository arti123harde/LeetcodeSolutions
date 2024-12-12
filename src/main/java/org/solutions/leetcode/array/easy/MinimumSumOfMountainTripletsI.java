package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumSumOfMountainTripletsI {

    public static void main(String[] args) {
        System.out.println(minimumSum(new int[]{8,6,1,5,3}));
    }

    public static int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] < nums[j] && nums[j] > nums[k]) min = Math.min(min, nums[i] + nums[j] + nums[k]);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}