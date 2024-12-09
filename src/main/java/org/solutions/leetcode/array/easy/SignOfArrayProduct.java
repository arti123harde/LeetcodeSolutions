package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SignOfArrayProduct {

    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
    }

    public static int arraySign(int[] nums) {
        int countNegative = 0;
        for(int n : nums){
            if(n == 0) return 0;
            else if(n < 0) countNegative++;
        }
        if(countNegative % 2 == 0) return 1;
        else return -1;
    }
}
