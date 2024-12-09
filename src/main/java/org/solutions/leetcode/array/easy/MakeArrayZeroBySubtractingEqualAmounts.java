package org.solutions.leetcode.array.easy;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class MakeArrayZeroBySubtractingEqualAmounts {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,5,0,3,5}));
        System.out.println(minimumOperations(new int[]{0}));
    }

    public static int minimumOperations(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int n : nums) if(n != 0) set.add(n);
        return set.size();
    }
}