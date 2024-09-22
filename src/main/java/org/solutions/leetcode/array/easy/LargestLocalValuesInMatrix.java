package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.utils.PrintUtil;

/**
 * @author Arti Harde
 */
public class LargestLocalValuesInMatrix {

    public static void main(String[] args) {
        PrintUtil.printArray(largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}}));
        PrintUtil.printArray(largestLocal(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}}));
    }

    public static int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid.length-2];
        for(int i=0; i< grid.length-2; i++){
            for(int j=0; j< grid.length-2; j++){
                result[i][j] = findMaxElement(grid, i, j);
            }
        }
        return result;
    }

    public static int findMaxElement(int[][] grid, int m, int n){
        int max = Integer.MIN_VALUE;
        for(int i=m; i < m+3; i++){
            for(int j=n; j < n+3; j++){
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }

}