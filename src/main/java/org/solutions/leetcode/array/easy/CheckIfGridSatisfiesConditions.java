package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CheckIfGridSatisfiesConditions {

    public static void main(String[] args) {
        System.out.println(satisfiesConditions(new int[][]{{1,0,2}, {1,0,2}}));
        System.out.println(satisfiesConditions(new int[][]{{1,1,1}, {0,0,0}}));
    }

    public static boolean satisfiesConditions(int[][] grid) {
        for(int i=0; i<grid[0].length; i++) for(int j=0; j< grid.length-1; j++) if(grid[j][i] != grid[j+1][i]) return false;
        for(int i=0; i<grid.length; i++) for(int j=0; j<grid[0].length-1; j++) if(grid[i][j] == grid[i][j+1]) return false;
        return true;
    }
}
