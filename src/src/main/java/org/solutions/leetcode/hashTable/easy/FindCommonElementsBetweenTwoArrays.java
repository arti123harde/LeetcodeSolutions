package org.solutions.leetcode.hashTable.easy;

import org.solutions.leetcode.common.PrintUtil;

import java.util.HashMap;

/**
 * @author Arti Harde
 */
public class FindCommonElementsBetweenTwoArrays {

    public static void main(String[] args) {
        PrintUtil.printArray(findIntersectionValues(new int[]{2,3,2}, new int[]{1,2}));
        PrintUtil.printArray(findIntersectionValues(new int[]{4,3,2,3,1}, new int[]{2,2,5,2,3,6}));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int c1 = 0;
        int c2 = 0;
        for(int n1 : nums1){
            map1.put(n1, map1.getOrDefault(n1, 0) + 1);
        }
        for(int n2 : nums2){
            map2.put(n2, map2.getOrDefault(n2, 0) + 1);
        }
        for(int k1 : map1.keySet()){
            if(map2.containsKey(k1)){
                c1 = c1 + map2.get(k1);
            }
        }
        for(int k2 : map2.keySet()){
            if(map1.containsKey(k2)){
                c2 = c2 + map1.get(k2);
            }
        }
        return new int[]{c2, c1};
    }
}