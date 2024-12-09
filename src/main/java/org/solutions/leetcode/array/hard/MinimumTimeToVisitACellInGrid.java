package org.solutions.leetcode.array.hard;

/**
 * @author Arti Harde
 */
public class MinimumTimeToVisitACellInGrid {

    public static void main(String[] args) {
        System.out.println(minimumTime(new int[][]{{0, 1, 3, 2}, {5, 1, 2, 5}, {4, 3, 8, 6}}));
    }

    public static int minimumTime(int[][] grid) {
        int time = 1;
        boolean pathExists = true;
        int rowIndex = 0;
        int colIndex = 0;
        while (pathExists && (rowIndex < grid.length || colIndex < grid[0].length)){
            int nextRowIndex = rowIndex;
            int nextColIndex = colIndex;
            int min = time;
            boolean found = false;
            //left
            if(colIndex-1 >= 0 && min >= grid[rowIndex][colIndex - 1]) {
                min = grid[rowIndex][colIndex - 1];
                found = true;
                nextRowIndex = rowIndex;
                nextColIndex = colIndex - 1;
            }
            //right
            if(colIndex+1 < grid[0].length  && min >= grid[rowIndex][colIndex + 1]) {
                min = grid[rowIndex][colIndex + 1];
                found = true;
                nextRowIndex = rowIndex;
                nextColIndex = colIndex + 1;
            }
            //up
            if(rowIndex-1 >= 0  && min >= grid[rowIndex - 1][colIndex]) {
                min = grid[rowIndex - 1][colIndex];
                found = true;
                nextColIndex = colIndex;
                nextRowIndex = rowIndex - 1;
            }
            //down
            if(rowIndex+1 < grid.length  && min >= grid[rowIndex + 1][colIndex]) {
                min = grid[rowIndex + 1][colIndex];
                found = true;
                nextColIndex = colIndex;
                nextRowIndex = rowIndex + 1;
            }
            rowIndex = nextRowIndex;
            colIndex = nextColIndex;
            pathExists = found;
            time++;
        }
        return grid[grid.length-1][grid[0].length-1] == -1 ? time : -1;
    }
}
