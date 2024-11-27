package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class LuckyNumbersInMatrix {

    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
        System.out.println(luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int rowMin = Integer.MIN_VALUE;
        int colMax = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) min = Math.min(min, row[j]);
            rowMin = Math.max(rowMin, min);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int[] row : matrix) max = Math.max(max, row[i]);
            colMax = Math.min(colMax, max);
        }
        if (rowMin == colMax) return new ArrayList<>(List.of(rowMin));
        else return new ArrayList<>();
    }
}
