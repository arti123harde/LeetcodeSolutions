package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CheckIfMatrixIsXMatrix {

    public static void main(String[] args) {
        System.out.println(checkXMatrix(new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}}));
    }

    public static boolean checkXMatrix(int[][] grid) {
        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid.length; j++){
               if(((j == i) || (j == grid.length - 1- i)) && grid[i][j] == 0) return false;
               else if(((j != i) && (j != grid.length - 1- i)) && grid[i][j] != 0) return false;
            }
        }
        return true;
    }
}
