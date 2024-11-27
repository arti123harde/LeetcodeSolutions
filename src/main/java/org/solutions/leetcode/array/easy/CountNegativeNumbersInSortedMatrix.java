package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountNegativeNumbersInSortedMatrix {

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1},
                {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        System.out.println(countNegatives(new int[][]{{3, 2}, {1, 0}}));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int cn = grid[0].length - 1;
        for(int[] row : grid){
            int col = cn;
            while(col >= 0 && row[col] < 0) {
                count++;
                col--;
            }
        }
        return count;
    }
}
