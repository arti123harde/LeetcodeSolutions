package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class Shift2DGrid {

    public static void main(String[] args) {
        System.out.println(shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
        System.out.println(shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10},
                {12, 0, 21, 13}}, 4));
        System.out.println(shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9));
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = 0;
        while (n < k){
            int temp = -2000;
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    int num = grid[i][j];
                    if(temp != -2000){
                        grid[i][j] = temp;
                    }
                    temp = num;
                }
            }
            grid[0][0] = temp;
            n++;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int[] i : grid){
            result.add(Arrays.stream(i).boxed().toList());
        }
        return result;
    }
}
