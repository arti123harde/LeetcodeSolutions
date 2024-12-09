package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class FindClosestNumberToZero {

    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{-100000, -100000}));
        System.out.println(findClosestNumber(new int[]{2,-1,1}));
        System.out.println(findClosestNumber(new int[]{-4,-2,1,4,8}));
    }

    public static int findClosestNumber(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            int diff = Math.abs(n);
            map.putIfAbsent(diff, new ArrayList<>());
            map.get(diff).add(n);
            min = Math.min(diff, min);
        }
        List<Integer> list = map.get(min);
        list.sort(Collections.reverseOrder());
        return list.get(0);
    }
}
