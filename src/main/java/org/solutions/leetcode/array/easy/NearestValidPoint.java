package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class NearestValidPoint {

    public static void main(String[] args) {
        System.out.println(nearestValidPoint(1, 1, new int[][]{{1, 2},{3, 3},{3, 3}}));
        System.out.println(nearestValidPoint(3, 4, new int[][]{{3, 4}}));
        System.out.println(nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}));
        System.out.println(nearestValidPoint(3, 4, new int[][]{{2,3}}));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        Map<Integer, Set<Integer>> map = new TreeMap<>();
        for(int i=0; i<points.length; i++){
            if(x == points[i][0] || y == points[i][1]) {
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(minDistance > distance){
                    minDistance = distance;
                    index = i;
                }
            }
        }
        return index;
    }
}
