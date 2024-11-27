package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CellsWithOddValuesInMatrix {

    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
        System.out.println(oddCells(2, 3, new int[][]{{1, 1}, {0, 0}}));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] array = new int[m][n];
        int count = 0;
        while(count < indices.length){
            //update rows
            for(int j=0; j<array.length; j++){
                array[j][indices[count][1]]++;
            }
            //update cols
            for(int j=0; j<array[0].length; j++){
                array[indices[count][0]][j]++;
            }
            count++;
        }
        int oddNums = 0;
        for(int[] i : array){
            for(int j : i){
                if(j % 2 != 0) oddNums++;
            }
        }
        return oddNums;
    }
}
