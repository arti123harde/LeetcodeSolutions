package org.solutions.leetcode.bitmanipulation.medium;

/**
 * @author Arti Harde
 */
public class NeighboringBitwiseXOR {

    public static void main(String[] args) {
        System.out.println(doesValidArrayExist(new int[]{1,1,0}));
    }

    public static boolean doesValidArrayExist(int[] derived) {
        int[] original = new int[derived.length + 1];
        original[0] = 0;
        for (int i = 0; i < derived.length; i++) original[i + 1] = derived[i] ^ original[i];
        boolean checkForZero = (original[0] == original[original.length - 1]);
        original[0] = 1;
        for (int i = 0; i < derived.length; i++) original[i + 1] = derived[i] ^ original[i];
        boolean checkForOne = (original[0] == original[original.length - 1]);
        return checkForZero || checkForOne;
    }
}
