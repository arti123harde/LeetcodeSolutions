package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class CheckArrayFormationThroughConcatenation {

    public static void main(String[] args) {
        System.out.println(canFormArray(new int[]{91,2,4,64,5,78,12,9}, new int[][]{{78, 12, 3}, {4, 64, 5}, {91, 2}}));
        System.out.println(canFormArray(new int[]{2,82,79,95,28}, new int[][]{{2}, {82}, {28}, {79, 95}}));
        System.out.println(canFormArray(new int[]{49,18,16}, new int[][]{{16,18,49}}));
        System.out.println(canFormArray(new int[]{15,88}, new int[][]{{88}, {15}}));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        List<Integer> rowsCovered = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            int len = checkRows(pieces, arr, rowsCovered, i);
            if(len == -1) return false;
            else i += len;
        }
        return true;
    }

    private static int checkRows(int[][] pieces, int[] arr, List<Integer> rowsCovered, int index){
        for(int i=0; i<pieces.length; i++){
            if(!rowsCovered.contains(i)){
                int k = index;
                boolean found = true;
                for(int j=0; j<pieces[i].length; j++){
                    if(arr[k] != pieces[i][j]) {
                        found = false;
                        break;
                    }
                    else k++;
                }
                if(found) {
                    rowsCovered.add(i);
                    return pieces[i].length;
                }
            }
        }
        return -1;
    }
}
