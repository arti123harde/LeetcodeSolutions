package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class NeitherMinimumNorMaximum {

    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[]{3,2,1,4}));
        System.out.println(findNonMinOrMax(new int[]{1,2}));
        System.out.println(findNonMinOrMax(new int[]{2,1,3}));
    }

    public static int findNonMinOrMax(int[] nums) {
        //Approach 1
//        if(nums.length <= 2) return -1;
//        Arrays.sort(nums);
//        return nums[nums.length/2];

        //Approach 2
        if (nums.length <= 2) return -1;
        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        int min = Math.min(nums[0], Math.min(nums[1], nums[2]));
        for (int i = 0; i<3; i++) if (nums[i] != max && nums[i] != min) return nums[i];
        return -1;
    }
}
