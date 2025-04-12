package org.solutions.leetcode.array.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class FirstCompletelyPaintedRowORColumn {

    public static void main(String[] args) {
        System.out.println(firstCompleteIndex(new int[]{1,3,4,2}, new int[][]{{1,4}, {2,3}}));
    }

    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] rc = new int[mat.length];
        int[] cc = new int[mat[0].length];
        Map<Integer, int[]> np = new HashMap<>();
        for (int r = 0; r < mat.length; r++){
            for (int c = 0; c < mat[0].length; c++) {
                np.put(mat[r][c], new int[] {r, c});
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int[] pos = np.get(num);
            int row = pos[0];
            int col = pos[1];
            rc[row]++;
            cc[col]++;
            if (rc[row] == mat.length || cc[col] == mat[0].length){
                return i;
            }
        }
        return -1;
    }
}
