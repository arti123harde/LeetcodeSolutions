package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class RankTransformOfArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40, 10, 20, 30})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{100,100,100})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }

    public static int[] arrayRankTransform(int[] arr) {
        //Approach 1 - Time Complexity - O(n log n) + O(n) = O(n log n)
//        List<Integer> list = new ArrayList<>();
//        int index = 0;
//        for(int i : arr) if(!list.contains(i)) list.add(i);
//        Collections.sort(list);
//        for(int i : arr) arr[index++] = list.indexOf(i) + 1;
//        return arr;

        //Approach 2 - Time Complexity - O(n log n) + O(n) = O(n log n)
        Map<Integer, Integer> rankMap = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        int index = 0;
        int rank = 1;
        for(int i : arr) set.add(i);
        for(int i : set) rankMap.put(i, rank++);
        for(int i : arr) arr[index++] = rankMap.get(i);
        return arr;
    }
}
