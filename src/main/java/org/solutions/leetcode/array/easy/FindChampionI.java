package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindChampionI {

    public static void main(String[] args) {
        System.out.println(findChampion(new int[][]{{0, 1}, {0, 0}}));
        System.out.println(findChampion(new int[][]{{0, 0, 1}, {1, 0, 1}, {0, 0, 0}}));
    }

    public static int findChampion(int[][] grid) {
        int team = 0;
        int max = 0;
        for(int i=0; i<grid.length; i++){
            int cnt = 0;
            for(int j=0; j<grid.length; j++) if(grid[i][j] == 1) cnt++;
            if(max < cnt){
                max = cnt;
                team = i;
            }
        }
        return team;
    }
}
