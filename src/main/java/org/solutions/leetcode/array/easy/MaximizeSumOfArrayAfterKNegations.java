package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MaximizeSumOfArrayAfterKNegations {

    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{-4,-2,-3}, 4));
        System.out.println(largestSumAfterKNegations(new int[]{4,2,3}, 1));
        System.out.println(largestSumAfterKNegations(new int[]{3,-1,0,2}, 3));
        System.out.println(largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        if(nums[0] >= 0 && k % 2 != 0){
            nums[0] = -nums[0];
        }else{
            int j = 0;
            while (k > 0 && j < nums.length && nums[j] < 0) {
                nums[j] = - nums[j];
                k--;
                j++;
            }
            if (k % 2 != 0) {
                int index = j < nums.length && nums[j] < nums[j - 1] ? j : j - 1;
                nums[index] = - nums[index];
            }
        }
        for(int n : nums) sum += n;
        return sum;
    }
}
