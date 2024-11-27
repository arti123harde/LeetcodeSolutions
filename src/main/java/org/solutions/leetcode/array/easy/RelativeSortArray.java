package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class RelativeSortArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},
                new int[]{2,1,4,3,9,6})));
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 21, 43, 38, 0, 42, 33, 7, 24,
                        13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31},
                new int[]{2, 42, 38, 0, 43, 21})));
        System.out.println(Arrays.toString(relativeSortArray(new int[]{28,6,22,8,44,17},
                new int[]{22,28,8,6})));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int k : arr1) {
            if (map.containsKey(k)) map.put(k, map.getOrDefault(k, 0) + 1);
            else if (list.contains(k)) list.add(k);
            else {
                boolean found = false;
                for (int i : arr2) {
                    if (k == i) {
                        map.put(k, map.getOrDefault(k, 0) + 1);
                        found = true;
                        break;
                    }
                }
                if (!found) list.add(k);
            }
        }
        int index = 0;
        for (int k : arr2){
            int i = 0;
            while (i < map.get(k)){
                arr1[index] = k;
                i++;
                index++;
            }
        }
        Collections.sort(list);
        for(int n : list){
            arr1[index] = n;
            index++;
        }
        return arr1;
    }
}
