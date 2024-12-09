package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class CountingElements {

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{1,2,3}));
        System.out.println(countElements(new int[]{1,1,3,3,5,5,7,7,6,6}));
    }

    public static int countElements(int[] arr) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        for(int n : map.keySet()){
            if(map.containsKey(n+1)) count += map.get(n);
        }
        return count;
    }
}
