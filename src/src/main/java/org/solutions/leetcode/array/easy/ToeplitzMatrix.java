package org.solutions.leetcode.array.easy;

public class ToeplitzMatrix {

    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
        System.out.println(isToeplitzMatrix(new int[][]{{1, 2}, {2,2}}));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int i = matrix.length-1;
        int j = 0;
        while (j<= matrix[0].length-1){
            int num = matrix[i][j];
            int n = i;
            int m = j;
            while(n <= matrix.length-1 && m <= matrix[0].length-1){
                if(matrix[n][m] != num) return false;
                m++;
                n++;
            }
            if(i != 0) i--;
            else j++;
        }
        return true;
    }
}
