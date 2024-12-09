package org.solutions.leetcode.contest;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class TransformedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructTransformedArray(new int[]{3, -2, 1, 1})));
        System.out.println(Arrays.toString(constructTransformedArray(new int[]{-1, 4, -1})));
    }

    public static int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = 0;
        while (i < nums.length){
            j = i;
            if(nums[j] > 0){
                int k = nums[j];
                while(k > 0){
                    j++;
                    if(j == nums.length) j = 0;
                    k--;
                }
                result[i++] = nums[j];
            }else if(nums[j] < 0){
                int k = Math.abs(nums[j]);
                while(k > 0){
                    j--;
                    if(j < 0) j = nums.length-1;
                    k--;
                }
                result[i++] = nums[j];
            }else result[i++] = nums[j];
        }
        return result;
    }
}
