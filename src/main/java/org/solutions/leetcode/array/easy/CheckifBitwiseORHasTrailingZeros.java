package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CheckifBitwiseORHasTrailingZeros {

    public static void main(String[] args) {
        System.out.println(hasTrailingZeros(new int[]{1,2,3,4,5}));
    }

    public static boolean hasTrailingZeros(int[] nums) {
        int evenCount = 0;
        for(int n : nums) if(evenCount >= 2) return true; else if(n % 2 == 0) evenCount++;
        return false;
    }
}
