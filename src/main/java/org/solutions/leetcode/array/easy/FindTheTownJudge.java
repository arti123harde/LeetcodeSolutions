package org.solutions.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FindTheTownJudge {

    public static void main(String[] args) {
        System.out.println(findJudge(3, new int[][]{{1, 2}, {2, 3}}));
        System.out.println(findJudge(2, new int[][]{{1,2}}));
        System.out.println(findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        System.out.println(findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] result = new int[n+1];
        for(int[] ts : trust){
            result[ts[0]]--;
            result[ts[1]]++;
        }
        for(int i=1; i<=n; i++) if(result[i] == n-1) return i;
        return -1 ;
    }
}
