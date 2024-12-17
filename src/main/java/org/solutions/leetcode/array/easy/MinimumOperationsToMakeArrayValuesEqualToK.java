package org.solutions.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class MinimumOperationsToMakeArrayValuesEqualToK {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{5,2,5,4,5}, 2));
        System.out.println(minOperations(new int[]{2,1,2}, 2));
        System.out.println(minOperations(new int[]{9,7,5,3}, 1));
    }

    public static int minOperations(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int i : nums) {
            if(i < k) return -1;
            if(i != k) st.add(i);
        }
        return st.size();
    }
}
