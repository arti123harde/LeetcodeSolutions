package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MatrixCellsInDistanceOrder {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(allCellsDistOrder(1, 2, 0, 0)));
        System.out.println(Arrays.deepToString(allCellsDistOrder(2, 3, 1, 2)));
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[index][0]=i;
                result[index][1]=j;
                index++;
            }
        }
        Arrays.sort(result,(m1,m2)->{
            int d1=Math.abs(m1[0]-rCenter)+Math.abs(m1[1]-cCenter);
            int d2=Math.abs(m2[0]-rCenter)+Math.abs(m2[1]-cCenter);
            return d1-d2;

        });
        return result;
    }
}
