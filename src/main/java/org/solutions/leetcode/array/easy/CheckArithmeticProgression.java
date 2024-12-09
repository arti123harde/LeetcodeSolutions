package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class CheckArithmeticProgression {

    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[]{3,5,1}));
        System.out.println(canMakeArithmeticProgression(new int[]{1,2,4}));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for(int i=1; i<arr.length-1; i++) if(diff != (arr[i] - arr[i+1])) return false;
        return true;
    }
}
