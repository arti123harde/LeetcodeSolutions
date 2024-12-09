package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class DivideArrayIntoEqualPairs {

    public static void main(String[] args) {
        System.out.println(divideArray(new int[]{3,2,3,2,2,2}));
        System.out.println(divideArray(new int[]{1,2,3,4}));
    }

    public static boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        int pairs = nums.length / 2;
        for(int n : map.keySet())  pairs -= (map.get(n)/2);
        return pairs == 0;
    }
}
