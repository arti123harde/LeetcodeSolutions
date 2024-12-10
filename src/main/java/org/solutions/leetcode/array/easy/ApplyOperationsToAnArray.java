package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class ApplyOperationsToAnArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(applyOperations(new int[]{1, 2, 2, 1, 1, 0})));
        System.out.println(Arrays.toString(applyOperations(new int[]{0,1})));
    }

    public static int[] applyOperations(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                arr[j++] = 2 * nums[i];
                nums[++i] = 0;
            } else arr[j++] = nums[i];
        }
        return arr;
    }
}
