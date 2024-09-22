package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.utils.PrintUtil;

/**
 * @author Arti Harde
 */
public class DesignNeighbourSumService {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        PrintUtil.printArray(grid);
        NeighborSum obj = new NeighborSum(grid);
        System.out.println(obj.adjacentSum(1));
        System.out.println(obj.adjacentSum(4));
        System.out.println(obj.diagonalSum(4));
        System.out.println(obj.diagonalSum(8));
    }

    private static class NeighborSum {

        private final int[] adjacent;
        private final int[] diagonal;

        public NeighborSum(int[][] grid) {
            int length = grid.length;
            adjacent = new int[length * length];
            diagonal = new int[length * length];
            for(int i=0; i<length; i++){
                for(int j=0; j<length; j++){
                    int num = grid[i][j];
                    boolean up = i-1 >= 0;
                    boolean down = i+1 <= length-1;
                    boolean left = j-1 >= 0 ;
                    boolean right = j+1 <= length-1;
                    if(up) adjacent[num] += grid[i-1][j];
                    if(down) adjacent[num] += grid[i+1][j];
                    if(left) adjacent[num] += grid[i][j-1];
                    if(right) adjacent[num] += grid[i][j+1];
                    if(up && left) diagonal[num] += grid[i-1][j-1];
                    if(up && right) diagonal[num] += grid[i-1][j+1];
                    if(down && left) diagonal[num] += grid[i+1][j-1];
                    if(down && right) diagonal[num] += grid[i+1][j+1];
                }
            }
        }

        public int adjacentSum(int value) {
            return adjacent[value];
        }

        public int diagonalSum(int value) {
            return diagonal[value];
        }
    }

}