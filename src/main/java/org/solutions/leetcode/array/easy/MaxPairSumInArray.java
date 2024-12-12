package org.solutions.leetcode.array.easy;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class MaxPairSumInArray {

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{8,75,28,35,21,13,21}));
        System.out.println(maxSum(new int[]{84,91,18,59,27,9,81,33,17,58}));
        System.out.println(maxSum(new int[]{112,131,411}));
        System.out.println(maxSum(new int[]{2536,1613,3366,162}));
    }

    public static int maxSum(int[] nums) {
        Map<Integer, List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        for (int num : nums) {
            int max = 0;
            int n = num;
            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                max = Math.max(rem, max);
            }
            map.putIfAbsent(max, new ArrayList<>());
            map.get(max).add(num);
        }
        int max = -1;
        for(int k : map.keySet()){
            List<Integer> list = map.get(k);
            list.sort(Collections.reverseOrder());
            if(list.size() >= 2) max = Math.max(max, list.get(0) + list.get(1));
        }
        return max;
    }
}
