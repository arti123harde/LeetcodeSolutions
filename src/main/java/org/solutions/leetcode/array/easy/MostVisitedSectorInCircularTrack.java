package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class MostVisitedSectorInCircularTrack {

    public static void main(String[] args) {
        System.out.println(mostVisited(4, new int[]{1,3,1,2}));
        System.out.println(mostVisited(2, new int[]{2,1,2,1,2,1,2,1,2}));
        System.out.println(mostVisited(7, new int[]{1,3,5,7}));
    }

    public static List<Integer> mostVisited(int n, int[] rounds) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<rounds.length-1; i++){
            int k = rounds[i];
            while (k != rounds[i+1]){
                map.put(k, map.getOrDefault(k, 0) + 1);
                k++;
                if(k > n) k = 1;
            }
        }
        map.put(rounds[rounds.length-1], map.getOrDefault(rounds[rounds.length-1], 0) + 1);
        int max = Integer.MIN_VALUE;
        for(int v : map.values()) max = Math.max(max, v);
        List<Integer> result = new ArrayList<>();
        for(int k : map.keySet()) if(map.get(k) == max) result.add(k);
        return result;
    }
}
