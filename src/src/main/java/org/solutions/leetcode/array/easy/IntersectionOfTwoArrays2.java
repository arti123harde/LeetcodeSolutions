package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

import java.util.HashMap;
import java.util.Map;


public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {
        PrintUtil.printArray(intersection(new int[]{1,2,2,1}, new int[]{2,2}));
        PrintUtil.printArray(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> s1 = new HashMap<>();
        Map<Integer, Integer> s2 = new HashMap<>();
        for(int n : nums1){
            s1.put(n, s1.getOrDefault(n, 0)+1);
        }
        for(int n : nums2){
            s2.put(n, s2.getOrDefault(n, 0)+1);
        }
        Map<Integer, Integer> result = new HashMap<>();
        int size = 0;
        for(int k : s1.keySet()){
            if(s2.containsKey(k)){
                result.put(k, Math.min(s1.get(k), s2.get(k)));
                size += Math.min(s1.get(k), s2.get(k));
            }
        }
        int index = 0;
        int[] array = new int[size];
        for(int s : result.keySet()){
           for(int i=0;  i<result.get(s); i++){
               array[index++] = s;
           }
        }
        return array;
    }
}
