package org.solutions.leetcode.array.easy;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class TwoOutOfThree {

    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[]{2,15,10,11,14,12,14,11,9,1}, new int[]{8,9,13,2,11,8}, new int[]{13,5,15,7,12,7,8,3,13,15}));
        System.out.println(twoOutOfThree(new int[]{1,1,3,2}, new int[]{2,3}, new int[]{3}));
        System.out.println(twoOutOfThree(new int[]{3,1}, new int[]{2,3}, new int[]{1,2}));
        System.out.println(twoOutOfThree(new int[]{1,2,2}, new int[]{4,3,3}, new int[]{5}));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> map3 = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length || j < nums2.length || k < nums3.length){
            if(i < nums1.length){
                map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
                set.add(nums1[i]);
                i++;
            }
            if(j < nums2.length){
                map2.put(nums2[j], map2.getOrDefault(nums2[j], 0) + 1);
                set.add(nums2[j]);
                j++;
            }
            if(k < nums3.length){
                map3.put(nums3[k], map3.getOrDefault(nums3[k], 0) + 1);
                set.add(nums3[k]);
                k++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int n : set){
            int a = map1.containsKey(n) ? 1 : 0;
            int b = map2.containsKey(n) ? 1 : 0;
            int c = map3.containsKey(n) ? 1 : 0;
            if(a + b + c >= 2) result.add(n);
        }
        return result;
    }
}
