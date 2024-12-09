package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FindDifferenceOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getDifferenceList(nums1, nums2), getDifferenceList(nums2, nums1));
    }

    private static List<Integer> getDifferenceList(int[] nums1, int[] nums2){
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums2) set.add(n);
        for(int n : nums1) if(!set.contains(n) && !result.contains(n)) result.add(n);
        return result;
    }

}
