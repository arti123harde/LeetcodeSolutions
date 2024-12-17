package org.solutions.leetcode.array.easy;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {

    public static void main(String[] args) {
        System.out.println(missingInteger(new int[]{3,4,5,1,12,14,13}));
        System.out.println(missingInteger(new int[]{38}));
        System.out.println(missingInteger(new int[]{4,5,6,7,8,8,9,4,3,2,7}));
        System.out.println(missingInteger(new int[]{1,2,3,2,5}));
    }

    public static int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1) sum += nums[i];
            else break;
        }
        for(int n : nums) set.add(n);
        while (set.contains(sum)) sum++;
        return sum;
    }
}
