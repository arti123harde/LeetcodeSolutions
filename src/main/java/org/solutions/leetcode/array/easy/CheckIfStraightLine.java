package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CheckIfStraightLine {

    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[1][0] -  coordinates[0][0];
        int y0 = coordinates[1][1] - coordinates[0][1];
        for(int i=2; i<coordinates.length; i++){
            int x1 = coordinates[i][0] - coordinates[0][0];
            int y1 = coordinates[i][1] - coordinates[0][1];;
            if(x1*y0 != x0*y1) return false;
        }
        return true;
    }
}
