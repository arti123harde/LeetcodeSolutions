package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Arti Harde
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    public static void main(String[] args) {
        System.out.println(maxWidthOfVerticalArea(new int[][]{{8,7},{9,9},{7,4},{9,7}}));
        System.out.println(maxWidthOfVerticalArea(new int[][]{{3,1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}}));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(i -> i[0]));
        int result = 0;
        for(int i=1; i< points.length; i++){
            result = Math.max(result, Math.abs(points[i][0] - points[i-1][0]));
        }
        return result;
    }
}