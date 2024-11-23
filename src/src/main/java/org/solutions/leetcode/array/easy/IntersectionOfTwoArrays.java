package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

import java.util.HashSet;
import java.util.Set;


public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        PrintUtil.printArray(intersection(new int[]{1,2,2,1}, new int[]{2,2}));
        PrintUtil.printArray(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int n : nums1){
            s1.add(n);
        }
        for(int n : nums2){
            s2.add(n);
        }
        s1.retainAll(s2);
        int index = 0;
        int[] result = new int[s1.size()];
        for(int s : s1){
            result[index++] = s;
        }
        return result;
    }
}
