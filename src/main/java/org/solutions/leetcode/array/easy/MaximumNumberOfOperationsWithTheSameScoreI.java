package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MaximumNumberOfOperationsWithTheSameScoreI {

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{5,3}));
        System.out.println(maxOperations(new int[]{3,2,1,4,5}));
        System.out.println(maxOperations(new int[]{1,5,3,3,4,1,3,2,2,3}));
    }

    public static int maxOperations(int[] nums) {
        int sum = nums[0] + nums[1];
        int op = 1;
        for(int i = 2; i < nums.length-1; i += 2){
            if(nums[i] + nums[i+1] == sum) op++;
            else break;
        }
        return op;
    }
}
