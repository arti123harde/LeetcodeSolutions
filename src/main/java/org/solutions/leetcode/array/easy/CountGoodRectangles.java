package org.solutions.leetcode.array.easy;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class CountGoodRectangles {

    public static void main(String[] args) {
        System.out.println(countGoodRectangles(new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}}));
        System.out.println(countGoodRectangles(new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}}));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int[] rectangle : rectangles){
            int len = Math.min(rectangle[0], rectangle[1]);
            map.put(len, map.getOrDefault(len, 0) + 1);
            maxLen = Math.max(maxLen, len);
        }
        return map.get(maxLen);
    }
}
