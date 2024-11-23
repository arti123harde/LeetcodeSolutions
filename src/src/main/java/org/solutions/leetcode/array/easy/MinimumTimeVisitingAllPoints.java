package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumTimeVisitingAllPoints {

    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}}));
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for(int i=0; i<points.length-1; i++){
            int diff = (Math.abs(points[i+1][0] - points[i][0]));
            int diff1 = (Math.abs(points[i+1][1] - points[i][1]));
            count += Math.max(diff1, diff);
        }
        return count;
    }
}