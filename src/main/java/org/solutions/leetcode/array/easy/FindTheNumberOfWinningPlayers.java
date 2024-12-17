package org.solutions.leetcode.array.easy;

import java.util.Map;

/**
 * @author Arti Harde
 */
public class FindTheNumberOfWinningPlayers {

    public static void main(String[] args) {
        System.out.println(winningPlayerCount(4, new int[][]{{0, 0}, {1, 0}, {1, 0}, {2, 1},
                {2, 1}, {2, 0}}));
        System.out.println(winningPlayerCount(5, new int[][]{{1, 1}, {1, 2}, {1, 3}, {1, 4}}));
    }

    public static int winningPlayerCount(int n, int[][] pick) {
        int result = 0;
        int[][] arr = new int[n][11];
        for(int[] p : pick) arr[p[0]][p[1]]++;
        for(int i=0; i<n; i++) {
            for(int j=0; j<11; j++) {
                if(arr[i][j] >= i+1) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
