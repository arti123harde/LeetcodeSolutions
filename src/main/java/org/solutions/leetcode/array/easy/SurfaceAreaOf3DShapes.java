package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SurfaceAreaOf3DShapes {

    public static void main(String[] args) {
        System.out.println(surfaceArea(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(surfaceArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}));
        System.out.println(surfaceArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}));
    }

    public static int surfaceArea(int[][] grid) {
        int result = 0;
        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid.length; j++){
                int area = 0;
                int height = grid[i][j];
                if(height != 0){
                    area = 2 + (height * 4);
                    if(i > 0) area -= Math.min(height, grid[i-1][j]);
                    if (i < grid.length - 1)    area -= Math.min(height, grid[i + 1][j]);
                    if (j > 0)    area -= Math.min(height, grid[i][j - 1]);
                    if (j < grid[0].length - 1)    area -= Math.min(height, grid[i][j + 1]);
                }
                result += area;
            }
        }
        return result;
    }
}
