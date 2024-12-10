package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Arti Harde
 */
public class DeleteGreatestValueInEachRow {

    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
        System.out.println(deleteGreatestValue(new int[][]{{10}}));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for (int[] n : grid)  Arrays.sort(n);
        for(int i=grid[0].length-1; i>=0; i--){
            int max = 0;
            for (int[] rows : grid) max = Math.max(max, rows[i]);
            sum += max;
        }
        return sum;
    }
}
