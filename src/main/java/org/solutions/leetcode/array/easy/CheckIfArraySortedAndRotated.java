package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class CheckIfArraySortedAndRotated {

    public static void main(String[] args) {
        System.out.println(check(new int[]{6,10,6}));
        System.out.println(check(new int[]{3,4,5,1,2}));
        System.out.println(check(new int[]{2,1,3,4}));
        System.out.println(check(new int[]{1,2,3}));
    }

    public static boolean check(int[] nums) {
        int index = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] > nums[i]) index++;
        }
        if(nums[0] < nums[nums.length - 1]) index++;
        return index <= 1;
    }
}
