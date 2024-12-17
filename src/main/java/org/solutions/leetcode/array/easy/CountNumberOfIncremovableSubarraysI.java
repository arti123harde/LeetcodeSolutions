package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountNumberOfIncremovableSubarraysI {

    public static void main(String[] args) {
        System.out.println(incremovableSubarrayCount(new int[]{1,2,3,4}));
        System.out.println(incremovableSubarrayCount(new int[]{6,5,7,8}));
        System.out.println(incremovableSubarrayCount(new int[]{8,7,6,6}));
    }

    public static int incremovableSubarrayCount(int[] nums) {
        int count = 0;
        int min = 0;
        int i =0;
        while (i < nums.length){
            int max = 51;
            int j = nums.length - 1;
            while (j >= i){
                count++;
                if(min >= nums[j] || nums[j] >= max) break;
                max = nums[j];
                j--;
            }
            if(min >= nums[i]) break;
            min = nums[i];
            i++;
        }
        return count;
    }


}
