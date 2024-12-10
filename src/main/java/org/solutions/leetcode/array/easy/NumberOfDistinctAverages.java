package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class NumberOfDistinctAverages {

    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[]{4,1,4,0,3,5}));
        System.out.println(distinctAverages(new int[]{1,100}));
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        for(int i=0, j=nums.length-1; i<j; i++,j--) set.add((nums[i] + nums[j])/2.0);
        return set.size();
    }
}
