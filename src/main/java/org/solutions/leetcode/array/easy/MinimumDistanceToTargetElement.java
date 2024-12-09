package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumDistanceToTargetElement {

    public static void main(String[] args) {
        System.out.println(getMinDistance(new int[]{1,2,3,4,5}, 5, 3));
        System.out.println(getMinDistance(new int[]{1}, 1, 0));
        System.out.println(getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,1}, 1, 0));
    }

    public static int getMinDistance(int[] nums, int target, int start) {
        int minAbs = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) if(nums[i] == target && minAbs > Math.abs(i - start)) minAbs = Math.abs(i - start);
        return minAbs;
    }
}
