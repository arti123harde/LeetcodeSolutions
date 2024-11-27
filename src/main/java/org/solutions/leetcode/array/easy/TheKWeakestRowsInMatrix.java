package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class TheKWeakestRowsInMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3)));
        System.out.println(Arrays.toString(kWeakestRows(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1},
                {1, 0, 0, 0}, {1, 0, 0, 0}}, 2)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int index = 0;
        for(int[] i : mat){
            int sum = 0;
            for(int j : i) sum += j;
            if(!map.containsKey(sum)) map.put(sum, new ArrayList<>());
            map.get(sum).add(index++);
        }
        int[] result = new int[k];
        index = 0;
        for(int n : map.keySet()){
            for (int m : map.get(n)){
               if(index < k)  result[index++] = m;
               else break;
            }
        }
        return result;
    }
}
