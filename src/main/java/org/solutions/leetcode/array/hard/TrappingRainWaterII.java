package org.solutions.leetcode.array.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class TrappingRainWaterII {

    public static void main(String[] args) {
        System.out.println(trapRainWater(new int[][]{{1,4,3,1,3,2}, {3,2,1,3,2,4}, {2,3,3,2,3,1}}));
    }

    public static int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) return 0;
        int m = heightMap.length;
        int n = heightMap[0].length;
        int amountOfWaterTrapper = 0;
        boolean[][] visited = new boolean[m][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < m; ++i) {
            for (int j : new int[]{0, n - 1}) {
                minHeap.offer(new int[]{heightMap[i][j], i, j});
                visited[i][j] = true;
            }
        }
        for (int j = 0; j < n; ++j) {
            for (int i : new int[]{0, m - 1}) {
                if (!visited[i][j]) {
                    minHeap.offer(new int[]{heightMap[i][j], i, j});
                    visited[i][j] = true;
                }
            }
        }
        while (!minHeap.isEmpty()) {
            int[] cell = minHeap.poll();
            for (int[] dir : directions) {
                int cx = cell[1] + dir[0];
                int cy = cell[2]+ dir[1];
                if (cx >= 0 && cx < m && cy >= 0 && cy < n && !visited[cx][cy]) {
                    amountOfWaterTrapper += Math.max(0, cell[0] - heightMap[cx][cy]);
                    minHeap.offer(new int[]{Math.max(cell[0], heightMap[cx][cy]), cx, cy});
                    visited[cx][cy] = true;
                }
            }
        }
        return amountOfWaterTrapper;
    }
}
