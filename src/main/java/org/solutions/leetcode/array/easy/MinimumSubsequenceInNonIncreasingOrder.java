package org.solutions.leetcode.array.easy;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class MinimumSubsequenceInNonIncreasingOrder {

    public static void main(String[] args) {
        System.out.println(minSubsequence(new int[]{4,3,10,9,8}));
        System.out.println(minSubsequence(new int[]{4,4,7,6,7}));
    }

    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new LinkedList<>();
        int totalSum = 0;
        int sum = 0;
        Arrays.sort(nums);
        for(int n : nums) totalSum += n;
        for(int i=nums.length-1; i>=0; i--){
            sum += nums[i];
            result.add(nums[i]);
            totalSum -= nums[i];
            if(sum > totalSum) break;
        }
        return result;
    }
}
