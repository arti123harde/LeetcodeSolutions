package org.solutions.leetcode.array.medium;

/**
 * @author Arti Harde
 */
public class GridGame {

    public static void main(String[] args) {
        System.out.println(gridGame(new int[][]{{2, 5, 4}, {1, 5, 1}}));
    }

    public static long gridGame(int[][] grid) {
        long fr = 0;
        long sr = 0;
        long min = Long.MAX_VALUE;
        for (int num : grid[0])  fr += num;
        for (int i = 0; i < grid[0].length; ++i) {
            fr -= grid[0][i];
            min = Math.min(min, Math.max(fr, sr));
            sr += grid[1][i];
        }
        return min;
    }
}
