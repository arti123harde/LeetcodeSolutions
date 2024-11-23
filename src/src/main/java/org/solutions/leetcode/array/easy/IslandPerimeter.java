package org.solutions.leetcode.array.easy;

public class IslandPerimeter {

    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
        System.out.println(islandPerimeter(new int[][]{{1}}));
        System.out.println(islandPerimeter(new int[][]{{1, 0}}));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid[i].length; j++){
                if(grid[i][j] == 1){
                    int sum = 4;
                    //up
                    if(i-1 >= 0) sum -= grid[i-1][j];
                    //down
                    if(i+1 < grid.length) sum -= grid[i+1][j];
                    //left
                    if(j-1 >= 0) sum -= grid[i][j-1];
                    //right
                    if(j+1 < grid[i].length) sum -= grid[i][j+1];
                    perimeter += sum;
                }
            }
        }
        return perimeter;
    }
}
