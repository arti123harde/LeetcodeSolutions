package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class KeepMultiplyingFoundValuesByTwo {

    public static void main(String[] args) {
        System.out.println(findFinalValue(new int[]{5,3,6,1,12}, 3));
    }

    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        while (true){
            if(Arrays.binarySearch(nums, original) >= 0) original = original * 2;
            else break;
        }
        return original;
    }
}
