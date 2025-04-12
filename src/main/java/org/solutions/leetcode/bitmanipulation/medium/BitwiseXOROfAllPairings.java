package org.solutions.leetcode.bitmanipulation.medium;

/**
 * @author Arti Harde
 */
public class BitwiseXOROfAllPairings {

    public static void main(String[] args) {
        System.out.println(xorAllNums(new int[]{2,1,3}, new int[]{10,2,5,0}));
    }

    public static int xorAllNums(int[] nums1, int[] nums2) {
        int x1 = 0;
        int x2 = 0;
        if(nums2.length % 2 != 0) for(int num : nums1) x1 ^= num;
        if(nums1.length % 2 != 0) for(int num : nums2) x2 ^= num;
        return x1 ^ x2;
    }
}
