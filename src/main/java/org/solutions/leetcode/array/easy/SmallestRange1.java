package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SmallestRange1 {

    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{1}, 0));
        System.out.println(smallestRangeI(new int[]{0,10}, 2));
        System.out.println(smallestRangeI(new int[]{1,3,6}, 3));
    }

    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for(int n : nums){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return Math.max(0, max - min - (2*k));
    }
}
