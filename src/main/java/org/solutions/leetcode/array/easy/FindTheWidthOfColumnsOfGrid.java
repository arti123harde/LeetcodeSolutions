package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FindTheWidthOfColumnsOfGrid {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findColumnWidth(new int[][]{{1}, {22}, {333}})));
        System.out.println(Arrays.toString(findColumnWidth(new int[][]{{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}})));
    }

    public static int[] findColumnWidth(int[][] grid) {
        int[] result = new int[grid[0].length];
        for(int i=0; i<grid[0].length; i++){
            int max = Integer.toString(grid[0][i]).length();
            for (int[] rows : grid) max = Math.max(max, Integer.toString(rows[i]).length());
            result[i] = max;
        }
        return result;
    }
}
