package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class SortArrayByIncreasingFrequency {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{1,1,2,2,2,3})));
        System.out.println(Arrays.toString(frequencySort(new int[]{2,3,1,3,2})));
        System.out.println(Arrays.toString(frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1})));
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((e1, e2) -> {
            int compareValues = e1.getValue().compareTo(e2.getValue());
            if (compareValues != 0) return compareValues;
            else return e2.getKey().compareTo(e1.getKey());
        });
        int[] result = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            int n = entry.getValue();
            while (n > 0){
                result[index] = entry.getKey();
                index++;
                n--;
            }
        }
        return result;
    }

}
