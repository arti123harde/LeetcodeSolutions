package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountTripletsWithEvenXORSetBitsI {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.bitCount(7));
        System.out.println(tripletCount(new int[]{1}, new int[]{2}, new int[]{3}));
        System.out.println(tripletCount(new int[]{1, 1}, new int[]{2, 3}, new int[]{1, 5}));
    }

    public static int tripletCount(int[] a, int[] b, int[] c) {
        int count = 0;
        for (int l : a) {
            for (int m : b) {
                for (int n : c) {
                    int frequency = Integer.bitCount(l ^ m ^ n);
                    if (frequency % 2 == 0) count++;
                }
            }
        }
        return count;
    }
}