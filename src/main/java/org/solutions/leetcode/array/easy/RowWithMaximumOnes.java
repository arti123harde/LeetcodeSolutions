package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class RowWithMaximumOnes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][]{{0, 1}, {1, 0}})));
        System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][]{{0,0,0}, {0,1,1}})));
        System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][]{{0,0}, {1,1}, {0,0}})));
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int index = 0;
        for(int i=0; i<mat.length; i++){
            int ones = 0;
            for(int j=0; j<mat[0].length; j++) ones += mat[i][j];
            if(max < ones){
                index = i;
                max = ones;
            }
        }
        return new int[]{index, max};
    }
}
