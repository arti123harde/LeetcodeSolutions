package org.solutions.leetcode.greedy.medium;

/**
 * @author Arti Harde
 */
public class MinimizeXOR {

    public static void main(String[] args) {
        System.out.println(minimizeXor(3,5));
    }

    public static int minimizeXor(int num1, int num2) {
        int result = 0;
        int bitCounts = Integer.bitCount(num2);
        int setBitsCount = 0;
        int currentBit = 31;
        while (setBitsCount < bitCounts) {
            if ((num1 & (1 << currentBit)) != 0 || (bitCounts - setBitsCount > currentBit)) {
                result = result | (1 << currentBit);
                setBitsCount++;
            }
            currentBit--;
        }
        return result;
    }
}
