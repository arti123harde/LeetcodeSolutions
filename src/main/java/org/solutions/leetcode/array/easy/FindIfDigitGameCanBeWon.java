package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindIfDigitGameCanBeWon {

    public static void main(String[] args) {
        System.out.println(canAliceWin(new int[]{6,6,12}));
        System.out.println(canAliceWin(new int[]{1,2,3,4,10}));
        System.out.println(canAliceWin(new int[]{1,2,3,4,5,14}));
        System.out.println(canAliceWin(new int[]{5,5,5,25}));
    }

    public static boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for (int num : nums) {
            if (num / 10 == 0) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }
        return singleDigitSum != doubleDigitSum;
    }
}