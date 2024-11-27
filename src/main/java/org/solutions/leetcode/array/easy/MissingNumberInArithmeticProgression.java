package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MissingNumberInArithmeticProgression {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{5,7,11,13}));
        System.out.println(missingNumber(new int[]{15,13,12}));
    }

    public static int missingNumber(int[] arr) {
        int diff = (arr[arr.length - 1] - arr[0]) / arr.length;
        int expected = arr[0];
        for(int n : arr) if(n != expected) return expected; else expected += diff;
        return expected;
    }
}
