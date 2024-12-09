package org.solutions.leetcode.array.easy;

import org.camunda.feel.syntaxtree.In;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FindSubarraysWithEqualSum {

    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[]{1,2,3,4,5}));
    }

    public static boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length-1; i++){
            int sum = nums[i] + nums[i+1];
            if(set.contains(sum)) return true;
            else set.add(sum);
        }
        return false;
    }
}