package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FormSmallestNumberFromTwoDigitArrays {

    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{3,5,2,6}, new int[]{3,1,7}));
    }

    public static int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        int m1 = nums1[0] * 10 + nums2[0];
        int m2 = nums2[0] * 10 + nums1[0];
        return Math.min(m1, m2);
    }
}
