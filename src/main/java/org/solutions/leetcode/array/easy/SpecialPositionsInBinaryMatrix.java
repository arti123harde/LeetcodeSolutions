package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class SpecialPositionsInBinaryMatrix {

    public static void main(String[] args) {
        System.out.println(numSpecial(new int[][]{{0, 0, 0, 1}, {1, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
        System.out.println(numSpecial(new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}));
        System.out.println(numSpecial(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    public static int numSpecial(int[][] mat) {
        int count = 0;
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1 && (rows[i] == 1 && cols[j] == 1)) count++;
            }
        }
        return count;
    }
}
