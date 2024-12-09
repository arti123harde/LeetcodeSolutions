package org.solutions.leetcode.array.easy;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class SubsequenceOfLengthKWithLargestSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubsequence(new int[]{63,-74,61,-17,-55,-59,-10,2,-60,-65}, 9)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{2, 1, 3, 3}, 2)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{-1,-2,3,4}, 3)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{3,4,3,3}, 2)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        if(nums.length == k) return nums;
        int[] result = new int[k];
        Map<Integer, Set<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            map.putIfAbsent(nums[i], new HashSet<>());
            map.get(nums[i]).add(i);
        }
        int n = k;
        Set<Integer> set = new TreeSet<>();
        for(int j : map.keySet()){
            for(int l : map.get(j)){
                set.add(l);
                n--;
                if(n == 0) break;
            }
            if(n == 0) break;
        }
        int index = 0;
        for(int j : set) result[index++] = nums[j];
        return result;
    }
}
