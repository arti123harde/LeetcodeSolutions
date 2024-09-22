package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class DifferenceBetweenElementSumAndDigitSumOfArray {

    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{1,15,6,3}));
        System.out.println(differenceOfSum(new int[]{1,2,3,4}));
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int n : nums){
            elementSum += n;
            int div = n;
            int mod = 0;
            while (div != 0){
                mod = div % 10;
                digitSum += mod;
                div = div / 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}