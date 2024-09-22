package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MatrixDiagonalSum {

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}}));
        System.out.println(diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
        System.out.println(diagonalSum(new int[][]{{5}}));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat[0].length;
        for(int i=0,j=len-1; i<len && j>=0; i++,j--){
            if(i == j) sum += mat[i][i];
            else sum += (mat[i][len-i-1] + mat[j][len-i-1]);
        }
        return sum;
    }
}