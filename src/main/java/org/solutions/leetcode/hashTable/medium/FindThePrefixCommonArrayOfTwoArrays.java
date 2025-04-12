package org.solutions.leetcode.hashTable.medium;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FindThePrefixCommonArrayOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findThePrefixCommonArray(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4})));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];
        int[] countArray = new int[A.length + 1];
        int count = 0;
        for(int i=0; i<A.length; i++){
            countArray[A[i]]++;
            if(countArray[A[i]] == 2) ++count;
            countArray[B[i]]++;
            if(countArray[B[i]] == 2) ++count;
            result[i] = count;
        }
        return result;
    }
}
