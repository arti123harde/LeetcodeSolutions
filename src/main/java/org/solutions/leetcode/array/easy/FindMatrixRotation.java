package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindMatrixRotation {

    public static void main(String[] args) {
        System.out.println(findRotation(new int[][]{{0, 1}, {1, 0}}, new int[][]{{1, 0}, {0, 1}}));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int oneMove = 0;
        int twoMoves = 0;
        int threeMoves = 0;
        int zeroMoves = 0;
        int n = mat.length;
        for(int i=0; i<n; i++) {
            for(int j=0;j<n;j++) {
                if(target[i][j] == mat[n-j-1][i]) oneMove++;
                if(target[i][j] == mat[n-i-1][n-j-1]) twoMoves++;
                if(target[i][j] == mat[j][n-i-1]) threeMoves++;
                if(target[i][j] == mat[i][j]) zeroMoves++;
            }
        }
        return oneMove == n * n || threeMoves == n * n || twoMoves == n * n || zeroMoves == n * n;
    }
}
