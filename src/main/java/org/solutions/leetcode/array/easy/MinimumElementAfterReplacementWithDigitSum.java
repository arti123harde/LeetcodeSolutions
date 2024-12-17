package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumElementAfterReplacementWithDigitSum {

    public static void main(String[] args) {
        System.out.println(minElement(new int[]{10,12,13,14}));
        System.out.println(minElement(new int[]{1,2,3,4}));
    }

    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n : nums){
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            min = Math.min(min, sum);
        }
        return min;
    }
}
