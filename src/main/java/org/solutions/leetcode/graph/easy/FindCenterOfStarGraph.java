package org.solutions.leetcode.graph.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FindCenterOfStarGraph {

    public static void main(String[] args) {
        System.out.println(findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}}));
    }

    public static int findCenter(int[][] edges) {
        //Approach 1 - Brute force
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int[] e : edges){
//            map.put(e[0], map.getOrDefault(e[0], 0) + 1);
//            map.put(e[1], map.getOrDefault(e[1], 0) + 1);
//        }
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) if(entry.getValue() == edges.length) return entry.getKey();
//        return -1;


        //Approach 2 - Greedy
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
