package org.solutions.leetcode.graph.hard;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author Arti Harde
 */
public class MinimumCostToMakeAtLeastOneValidPathInGrid {

    private static final int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public static void main(String[] args) {
        System.out.println(minCost(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2},
                {1, 1, 1, 1}, {2, 2, 2, 2}}));
    }

    public static int minCost(int[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int[][] minCost = new int[nr][nc];
        for (int[] row : minCost) Arrays.fill(row, Integer.MAX_VALUE);
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerFirst(new int[] { 0, 0 });
        minCost[0][0] = 0;
        while (!deque.isEmpty()) {
            int[] curr = deque.pollFirst();
            int row = curr[0];
            int col = curr[1];
            for (int dir = 0; dir < 4; dir++) {
                int newRow = row + dirs[dir][0];
                int newCol = col + dirs[dir][1];
                int cost = (grid[row][col] != (dir + 1)) ? 1 : 0;
                if ((newRow >= 0 && newRow < nr && newCol >= 0 && newCol < nc)
                        && minCost[row][col] + cost < minCost[newRow][newCol]) {
                    minCost[newRow][newCol] = minCost[row][col] + cost;
                    if (cost == 1) deque.offerLast(new int[] { newRow, newCol });
                    else deque.offerFirst(new int[] { newRow, newCol });
                }
            }
        }
        return minCost[nr - 1][nc - 1];
    }
}
