package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class Convert1DArrayInto2DArray {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1,2,3}, 1, 3)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m * n != original.length) return new int[][]{};
        int[][] result = new int[m][n];
        int index = 0;
        for(int i=0; i<m; i++){
            result[i] = Arrays.copyOfRange(original, index, index+ n);
            index += n;
        }
        return result;
    }
}
