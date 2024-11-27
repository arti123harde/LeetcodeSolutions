package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class ValidBoomerang {

    public static void main(String[] args) {
        System.out.println(isBoomerang(new int[][]{{0,0}, {0,2}, {2,1}}));
        System.out.println(isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
        System.out.println(isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }

    public static boolean isBoomerang(int[][] points) {
        int x0 = points[1][0] - points[0][0];
        int y0 = points[1][1] - points[0][1];
        int x1 = points[2][0] - points[1][0];
        int y1 = points[2][1] - points[1][1];
        return (y0*x1) != (x0*y1);
    }
}
