package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class LargestTriangleArea {

    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}));
        System.out.println(largestTriangleArea(new int[][]{{1, 0}, {0, 0}, {0, 1}}));
    }

    public static double largestTriangleArea(int[][] points) {
        double largestArea = 0.0;
        for(int[] i : points){
            for(int[] j : points){
                for (int[] k : points) {
                    largestArea = Math.max(largestArea, (0.5) * (i[0] * (j[1] - k[1]) +
                           j[0] * (k[1] - i[1]) + k[0] * (i[1] - j[1])));
                }
            }
        }
        return largestArea;
    }
}
