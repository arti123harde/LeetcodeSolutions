package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FindNUniqueIntegersSumUpToZero {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(3)));
        System.out.println(Arrays.toString(sumZero(1)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        if(n % 2 != 0) result[index++] = 0;
        for(int i=1; i<=n/2; i++){
            result[index++] = i;
            result[index++] = -i;
        }
        return result;
    }
}
