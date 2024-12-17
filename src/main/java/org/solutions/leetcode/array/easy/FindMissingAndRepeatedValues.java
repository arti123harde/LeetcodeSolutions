package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FindMissingAndRepeatedValues {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}})));
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}})));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
       int[] arr = new int[(grid.length * grid.length) + 1];
       for(int[] i : grid) for(int j : i) arr[j]++;
       int[] result = new int[2];
       for(int i=0; i<arr.length; i++){
           if(arr[i] == 2) result[0] = i;
           else if(arr[i] == 0) result[1] = i;
       }
       return result;
    }
}
