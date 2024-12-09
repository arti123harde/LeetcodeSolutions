package org.solutions.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class CheckIfEveryRowAndColumnContainsAllNumbers {

    public static void main(String[] args) {
        System.out.println(checkValid(new int[][]{{2,2,2}, {2,2,2}, {2,2,2}}));
        System.out.println(checkValid(new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}));
        System.out.println(checkValid(new int[][]{{1,1,1}, {1,2,3}, {1,2,3}}));
    }

    public static boolean checkValid(int[][] matrix) {
        int N = matrix.length;
        for(int i=0; i<N; i++){
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for(int j=0; j<N; j++){
                if(!set1.add(matrix[i][j])) return false;
                if(!set2.add(matrix[j][i])) return false;
            }
        }
        return true;
    }
}
