package org.solutions.leetcode.array.medium;

/**
 * @author Arti Harde
 */
public class MaxChunksToMakeSorted {


    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[]{4,3,2,1,0}));
        System.out.println(maxChunksToSorted(new int[]{1,0,2,3,4}));
    }

    public static int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i)  chunks++;
        }
        return chunks;
    }
}
