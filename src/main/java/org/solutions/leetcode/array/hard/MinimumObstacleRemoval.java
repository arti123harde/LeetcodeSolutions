package org.solutions.leetcode.array.hard;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Arti Harde
 */
public class MinimumObstacleRemoval {

    public static void main(String[] args) {
        System.out.println(minimumObstacles(new int[][]{{0, 1, 1}, {1, 1, 0}, {1, 1, 0}}));
    }

    public static int minimumObstacles(int[][] grid){
        //BFS Approach
        int[][] directions = {{ 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }};
        int m = grid.length;
        int n = grid[0].length;
        int[][] minObstacles = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) minObstacles[i][j] = Integer.MAX_VALUE;
        }
        minObstacles[0][0] = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[] { 0, 0, 0 });
        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            int obstacles = current[0], row = current[1], col = current[2];
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(newRow >= 0 && newCol >= 0 && newRow < grid.length && newCol < grid[0].length &&
                        minObstacles[newRow][newCol] == Integer.MAX_VALUE) {
                    if (grid[newRow][newCol] == 1) {
                        minObstacles[newRow][newCol] = obstacles + 1;
                        deque.addLast(new int[] { obstacles + 1, newRow, newCol });
                    } else {
                        minObstacles[newRow][newCol] = obstacles;
                        deque.addFirst(new int[] { obstacles, newRow, newCol });
                    }
                }
            }
        }
        return minObstacles[m - 1][n - 1];
    }

}
