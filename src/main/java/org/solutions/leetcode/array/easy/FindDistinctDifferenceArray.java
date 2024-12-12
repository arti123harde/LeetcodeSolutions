package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FindDistinctDifferenceArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] result = new int[nums.length];
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set1.add(nums[i]);
            Set<Integer> set2 = new HashSet<>();
            for(int l=i+1; l<nums.length; l++) set2.add(nums[l]);
            result[i] = set1.size() - set2.size();
        }
        return result;
    }
}
