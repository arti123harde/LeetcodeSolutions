package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class DetectPattern {

    public static void main(String[] args) {
        System.out.println(containsPattern(new int[]{1,2,4,4,4,4}, 1, 3));
        System.out.println(containsPattern(new int[]{1,2,1,2,1,1,1,3}, 2, 2));
    }

    public static boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;
        for(int i=0; i + m <arr.length; i++) {
            count = arr[i] == arr[i + m] ? count + 1 : 0;
            if (count == (k - 1) * m) return true;
        }
        return false;
    }
}
