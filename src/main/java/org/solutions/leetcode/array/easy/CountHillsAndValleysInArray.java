package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountHillsAndValleysInArray {

    public static void main(String[] args) {
        System.out.println(countHillValley(new int[]{57,57,57,57,57,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,85,85,85,86,86,86}));
        System.out.println(countHillValley(new int[]{6,6,5,5,4,1}));
        System.out.println(countHillValley(new int[]{2,4,1,1,6,5}));
    }

    public static int countHillValley(int[] nums) {
        int count = 0;
        int left = nums[0];
        for(int i = 1; i < nums.length - 1; i++)
            if(left < nums[i] && nums[i] > nums[i + 1] || left > nums[i] && nums[i] < nums[i + 1]){
                count++;
                left = nums[i];
            }
        return count;
    }
}
