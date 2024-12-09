package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class CheckIfAnArrayIsConsecutive {

    public static void main(String[] args) {
        System.out.println(isConsecutive(new int[]{1,3,4,2}));
        System.out.println(isConsecutive(new int[]{1,3}));
    }

    public static boolean isConsecutive(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) if(nums[i] + 1 != nums[i+1]) return false;
        return true;
    }
}
