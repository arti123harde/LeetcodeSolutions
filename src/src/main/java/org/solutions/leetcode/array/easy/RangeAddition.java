package org.solutions.leetcode.array.easy;

public class RangeAddition {

    public static void main(String[] args) {
        System.out.println(maxCount(3,3, new int[][]{{2, 2}, {3, 3}}));
        System.out.println(maxCount(3,3, new int[][]{{2, 2}, {3, 3}, {3, 3}, {3, 3},
                {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        for (int[] op: ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
}
