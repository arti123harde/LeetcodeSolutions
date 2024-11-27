package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class ProjectionAreaOf3DShapes {

    public static void main(String[] args) {
        System.out.println(projectionArea(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(projectionArea(new int[][]{{2}}));
    }

    public static int projectionArea(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length;  ++i) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < grid.length; ++j) {
                if (grid[i][j] > 0) ans++;
                row = Math.max(row, grid[i][j]);
                col = Math.max(col, grid[j][i]);
            }
            ans += row + col;
        }
        return ans;
    }
}
