package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MatrixSimilarityAfterCyclicShifts {

    public static void main(String[] args) {
        System.out.println(areSimilar(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 4));
        System.out.println(areSimilar(new int[][]{{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}}, 2));
        System.out.println(areSimilar(new int[][]{{2,2}, {2,2}}, 3));
    }

    public static boolean areSimilar(int[][] mat, int k) {
        for (int[] i : mat) for (int j = 0; j < mat[0].length; j++) if (i[j] != i[(j + k) % mat[0].length]) return false;
        return true;
    }
}
