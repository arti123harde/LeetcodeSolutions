package org.solutions.leetcode.graph.medium;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class FindChampion2 {

    public static void main(String[] args) {
        System.out.println(findChampion(3, new int[][]{{0, 1}, {1, 2}}));
        System.out.println(findChampion(4, new int[][]{{0, 2}, {1, 3}, {1, 2}}));
    }

    public static int findChampion(int n, int[][] edges) {
        int[] teams = new int[n];
        Arrays.fill(teams, -1);
        for(int[] edge : edges){
            teams[edge[1]]++;
        }
        int championsCount = 0;
        int champion = 0;
        for(int i=0; i<teams.length; i++) {
            if(teams[i] == -1){
                champion = i;
                championsCount++;
            }
        }
        return championsCount != 1 ? -1 : champion;
    }
}
