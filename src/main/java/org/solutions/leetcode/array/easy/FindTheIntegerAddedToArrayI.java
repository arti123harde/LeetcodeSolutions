package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindTheIntegerAddedToArrayI {

    public static void main(String[] args) {
        System.out.println(addedInteger(new int[]{2,6,4}, new int[]{9,7,5}));
    }

    public static int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int n : nums1) sum1 += n;
        for(int n : nums2) sum2 += n;
        return (sum2 - sum1) / nums2.length;
    }
}
