package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SumOfSquaresOfSpecialElements {

    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[]{1,2,3,4}));
        System.out.println(sumOfSquares(new int[]{2,7,1,19,18,3}));
    }

    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) if(n % (i+1) == 0) sum += (nums[i] * nums[i]);
        return sum;
    }
}
