package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumOperationsToMakeArrayIncreasing {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{6,4}));
        System.out.println(minOperations(new int[]{1,1,1}));
        System.out.println(minOperations(new int[]{1,5,2,4,1}));
    }

    public static int minOperations(int[] nums) {
        if(nums.length == 1) return 0;
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] >= nums[i]){
                int diff = nums[i-1] + 1 - nums[i];
                count += diff;
                nums[i] = nums[i-1] + 1;
            }
        }
        return count;
    }
}
