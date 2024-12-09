package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MakeTwoArraysEqualByReversingSubarrays {

    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3}));
        System.out.println(canBeEqual(new int[]{3,7,9}, new int[]{3,7,11}));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : target) map.put(n, map.getOrDefault(n, 0) + 1);
        for(int k : arr){
            if(map.containsKey(k)) {
                map.put(k, map.get(k) - 1);
                if(map.get(k) == 0) map.remove(k);
            }else return false;
        }
        return true;
    }
}
