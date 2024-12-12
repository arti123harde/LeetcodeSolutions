package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class LongestEvenOddSubarrayWithThreshold {

    public static void main(String[] args) {
        System.out.println(longestAlternatingSubarray(new int[]{2,3,3,10}, 18));
        System.out.println(longestAlternatingSubarray(new int[]{2,3,4,5}, 4));
        System.out.println(longestAlternatingSubarray(new int[]{3,2,5,4}, 5));
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int isEven = 0;
        for (int num : nums) {
            if (num > threshold) {
                isEven = 0;
                count = 0;
            } else if (num % 2 == 0) {
                if (isEven == 1) {
                    count = 1;
                    continue;
                }
                count++;
                max = Math.max(max, count);
                isEven = 1;
            } else {
                if (isEven == 0) {
                    count = 0;
                    continue;
                }
                count++;
                max = Math.max(max, count);
                isEven = 0;
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
