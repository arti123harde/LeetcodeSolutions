package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class CheckIfArrayIsGood {

    public static void main(String[] args) {
        System.out.println(isGood(new int[]{2, 1, 3}));
        System.out.println(isGood(new int[]{1, 3, 3, 2}));
    }

    public static boolean isGood(int[] nums) {
        int n = nums.length - 1;
        int[] count = new int[n + 1];
        for (int num : nums) {
            if (num > n) return false;
            count[num]++;
        }
        for (int i = 1; i < n; i++) if (count[i] != 1) return false;
        return count[n] == 2;
    }
}
