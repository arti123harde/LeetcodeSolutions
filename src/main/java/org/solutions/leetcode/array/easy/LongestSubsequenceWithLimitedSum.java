package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class LongestSubsequenceWithLimitedSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21})));
        System.out.println(Arrays.toString(answerQueries(new int[]{2,3,4,5}, new int[]{1})));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] result = new int[queries.length];
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            arr[i] = nums[i] + arr[i-1];
        }
        for(int i=0; i<queries.length; i++){
            int count = 0;
            int j = 0;
            while (j < arr.length && arr[j] <= queries[i]){
                j++;
                count++;
            }
            result[i] = count;
        }
        return result;
    }
}