package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MaximumStrongPairXORI {

    public static void main(String[] args) {
        System.out.println(maximumStrongPairXor(new int[]{5,6,25,30}));
    }

    public static int maximumStrongPairXor(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        return max;
    }
}
