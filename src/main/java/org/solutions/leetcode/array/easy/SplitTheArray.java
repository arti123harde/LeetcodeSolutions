package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SplitTheArray {

    public static void main(String[] args) {
        System.out.println(isPossibleToSplit(new int[]{1,1,2,2,3,4}));
    }

    public static boolean isPossibleToSplit(int[] nums) {
        int[] arr = new int[101];
        for(int n : nums) if(++arr[n] > 2) return false;
        return true;
    }
}
