package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MakeSquareWithSameColor {

    public static void main(String[] args) {
        System.out.println(canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'B'}}));
    }

    public static boolean canMakeSquare(char[][] grid) {
        if(checkGrid(0, 1, 0, 1, grid)) return true;
        else if(checkGrid(1, 2, 0, 1, grid)) return true;
        else if(checkGrid(0, 1, 1, 2, grid)) return true;
        else if(checkGrid(1, 2, 1, 2, grid)) return true;
        else return false;
    }

    private static boolean checkGrid(int rs, int re, int cs, int ce, char[][] grid){
        int b = 0;
        int w = 0;
        for(int i=rs; i<=re; i++){
            for(int j=cs; j<=ce; j++){
                if(grid[i][j] == 'W') w++;
                else b++;
            }
        }
        return b != w;
    }

}
