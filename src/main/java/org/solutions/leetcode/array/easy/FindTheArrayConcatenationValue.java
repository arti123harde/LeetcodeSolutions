package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindTheArrayConcatenationValue {

    public static void main(String[] args) {
        System.out.println(findTheArrayConcVal(new int[]{5,14,13,8,12}));
    }

    public static long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            if(i == j) sum += nums[j];
            else sum += Integer.parseInt(nums[i] + String.valueOf(nums[j]));
            i++;
            j--;
        }
        return sum;
    }
}
