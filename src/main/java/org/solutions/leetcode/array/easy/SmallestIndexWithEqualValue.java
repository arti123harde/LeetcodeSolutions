package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SmallestIndexWithEqualValue {

    public static void main(String[] args) {
        System.out.println(smallestEqual(new int[]{7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6}));
        System.out.println(smallestEqual(new int[]{0,1,2}));
        System.out.println(smallestEqual(new int[]{4,3,2,1}));
    }

    public static int smallestEqual(int[] nums) {
        for(int i=0; i<nums.length; i++) if(i % 10 == nums[i]) return i;
        return -1;
    }
}
