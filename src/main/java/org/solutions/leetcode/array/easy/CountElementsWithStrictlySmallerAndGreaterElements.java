package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class CountElementsWithStrictlySmallerAndGreaterElements {

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{11,7,2,15}));
        System.out.println(countElements(new int[]{-3,3,3,90}));
    }

    public static int countElements(int[] nums) {
        //Approach 1 - Sorting
//        Arrays.sort(nums);
//        int count = 0;
//        for(int i=1; i<nums.length-1; i++) if(nums[i] != nums[0] && nums[i] != nums[nums.length-1]) count++;
//        return count;

        //Approach 2
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for (int num : nums) if (num != min && num != max) count++;
        return count;
    }
}
