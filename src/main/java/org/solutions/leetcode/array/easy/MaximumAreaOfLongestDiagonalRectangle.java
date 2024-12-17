package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MaximumAreaOfLongestDiagonalRectangle {

    public static void main(String[] args) {
        System.out.println(areaOfMaxDiagonal(new int[][]{{10,3}, {5,9}, {8,3}}));
        System.out.println(areaOfMaxDiagonal(new int[][]{{9, 3}, {8, 6}}));
        System.out.println(areaOfMaxDiagonal(new int[][]{{3, 4}, {4, 3}}));
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal = 0;
        int area = 0;
        for(int[] dimension : dimensions){
            int l = dimension[0];
            int b = dimension[1];
            double d = (Math.sqrt((l * l) + (b * b)));
            int a = l * b;
            if(d > diagonal || (d == diagonal && area < a)){
                diagonal = d;
                area = a;
            }
        }
        return area;
    }
}
