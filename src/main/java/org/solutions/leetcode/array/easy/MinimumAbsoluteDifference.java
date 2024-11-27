package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4,2,1,3}));
        System.out.println(minimumAbsDifference(new int[]{1,3,6,10,15}));
        System.out.println(minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for(int i=0; i<arr.length-1; i++){
            int diff = Math.abs(arr[i+1] - arr[i]);
            if(!map.containsKey(diff)) map.put(diff, new ArrayList<>());
            map.get(diff).add(List.of(arr[i], arr[i+1]));
            min = Math.min(min, diff);
        }
        return map.get(min);
    }
}
