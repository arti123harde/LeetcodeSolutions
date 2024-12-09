package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class StrictlyIncreasingArray {

    public static void main(String[] args) {
        System.out.println(canBeIncreasing(new int[]{105,924,32,968}));
        System.out.println(canBeIncreasing(new int[]{1,2,3}));
        System.out.println(canBeIncreasing(new int[]{2,3,1,2}));
        System.out.println(canBeIncreasing(new int[]{1,2,10,5,7}));
    }

    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]) {
                count++;
                if(count > 1) return false;
                if(i > 1 && nums[i] <= nums[i-2]) nums[i] = nums[i - 1];
            }
        }
        return true;
    }
}
