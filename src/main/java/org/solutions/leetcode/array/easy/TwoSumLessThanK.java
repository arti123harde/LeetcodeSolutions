package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class TwoSumLessThanK {

    public static void main(String[] args) {
        System.out.println(twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60));
        System.out.println(twoSumLessThanK(new int[]{10,20,30}, 15));
    }

    public static int twoSumLessThanK(int[] nums, int k) {
        int sum = -1;
        //Approach 1 - Brute Force

//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i] + nums[j] < k) sum = Math.max(sum, nums[i] + nums[j]);
//            }
//        }


        //Approach 2 -Sorting and Two Pointers
        int i = 0;
        int j =nums.length - 1;
        Arrays.sort(nums);
        while (i < j) {
            int s = nums[i] + nums[j];
            if(s < k) {
                sum = Math.max(sum, s);
                i++;
            }else j--;
        }
        return sum;
    }
}
