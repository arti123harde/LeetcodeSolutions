package org.solutions.leetcode.contest;

/**
 * @author Arti Harde
 */
public class MinimumOperationsToMakeColumnsStrictlyIncreasing {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[][]{{0 ,0}, {0, 0}}));
        System.out.println(minimumOperations(new int[][]{{3, 2}, {1, 3}, {3, 4}, {0, 1}}));
    }

    public static int minimumOperations(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid[0].length; i++){
            int lastNum = grid[0][i];
            for(int j=1; j<grid.length; j++){
                if(grid[j][i] <= lastNum){
                    count += (lastNum + 1 - grid[j][i]);
                    lastNum++;
                }else{
                    lastNum = grid[j][i];
                }
            }
        }
        return count;
    }
}
