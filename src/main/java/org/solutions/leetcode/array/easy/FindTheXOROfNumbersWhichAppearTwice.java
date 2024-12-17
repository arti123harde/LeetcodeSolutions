package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindTheXOROfNumbersWhichAppearTwice {

    public static void main(String[] args) {
        System.out.println(duplicateNumbersXOR(new int[]{1,2,1,3}));
        System.out.println(duplicateNumbersXOR(new int[]{1,2,3}));
        System.out.println(duplicateNumbersXOR(new int[]{1,2,2,1}));
    }

    public static int duplicateNumbersXOR(int[] nums) {
        int[] arr = new int[51];
        int xor = 0;
        for(int n : nums) if(++arr[n] == 2) xor ^= n;
        return xor;
    }
}
