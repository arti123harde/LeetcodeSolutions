package org.solutions.leetcode.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class FindBuildingWhereAliceAndBobCanMeet {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftmostBuildingQueries(new int[]{1,2,1,2,1,2},
                new int[][]{{0,0},{0,1},{0,2},{0,3},{0,4},{0,5},{1,0},{1,1},{1,2},{1,3},{1,4},{1,5},
                        {2,0},{2,1},{2,2},{2,3},{2,4}, {2,5},{3,0},{3,1},{3,2},{3,3},{3,4},{3,5},
                        {4,0},{4,1},{4,2},{4,3},{4,4},{4,5},{5,0},{5,1},{5,2},{5,3},{5,4},{5,5}})));
        System.out.println(Arrays.toString(leftmostBuildingQueries(new int[]{6, 4, 8, 5, 2, 7},
                new int[][]{{0, 1}, {0, 3}, {2, 4}, {3, 4}, {2, 2}})));
        System.out.println(Arrays.toString(leftmostBuildingQueries(new int[]{5,3,8,2,6,1,4,6},
                new int[][]{{0, 7}, {3, 5}, {5, 2}, {3, 0}, {1, 6}})));
    }

    public static int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        List<List<List<Integer>>> storeQueries = new ArrayList<>(heights.length);
        for (int i = 0; i < heights.length; i++) storeQueries.add(new ArrayList<>());
        PriorityQueue<List<Integer>> maxIndex = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(0)));
        int[] result = new int[queries.length];
        Arrays.fill(result, -1);
        for (int currQuery = 0; currQuery < queries.length; currQuery++) {
            int a = queries[currQuery][0], b = queries[currQuery][1];
            if (a < b && heights[a] < heights[b]) result[currQuery] = b;
            else if (a > b && heights[a] > heights[b]) result[currQuery] = a;
            else if (a == b) result[currQuery] = a;
            else storeQueries.get(Math.max(a, b)).add(Arrays.asList(Math.max(heights[a], heights[b]), currQuery));
        }
        for (int index = 0; index < heights.length; index++) {
            while (!maxIndex.isEmpty() && maxIndex.peek().get(0) < heights[index]) {
                result[maxIndex.peek().get(1)] = index;
                maxIndex.poll();
            }
            for (List<Integer> element : storeQueries.get(index)) maxIndex.offer(element);
        }
        return result;
    }
}
