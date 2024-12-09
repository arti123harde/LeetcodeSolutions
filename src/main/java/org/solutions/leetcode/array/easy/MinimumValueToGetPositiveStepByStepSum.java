package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumValueToGetPositiveStepByStepSum {

    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3,2,-3,4,2}));
        System.out.println(minStartValue(new int[]{1,2}));
        System.out.println(minStartValue(new int[]{1,-2,-3}));
    }

    public static int minStartValue(int[] nums) {
        int minStepSum = Integer.MAX_VALUE;
        int sum = 0;
        for(int n : nums){
            sum += n;
            minStepSum = Math.min(minStepSum, sum);
        }
        if(minStepSum < 1) return (1 - minStepSum);
        else return minStepSum;
    }
}
