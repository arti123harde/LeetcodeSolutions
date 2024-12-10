package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindTheMaximumDivisibilityScore {

    public static void main(String[] args) {
        System.out.println(maxDivScore(new int[]{2,9,15,50}, new int[]{5,3,7,2}));
    }

    public static int maxDivScore(int[] nums, int[] divisors) {
        int max = 0;
        int val = divisors[0];
        for (int divisor : divisors) {
            int count = 0;
            for (int num : nums) if (num % divisor == 0) count++;
            if(max < count || (max == count && divisor < val)) {
                max = count;
                val = divisor;
            }
        }
        return val;
    }
}
