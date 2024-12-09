package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindLuckyIntegerInArray {

    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{2,2,3,4}));
        System.out.println(findLucky(new int[]{1,2,2,3,3,3}));
        System.out.println(findLucky(new int[]{2,2,2,3,3}));
    }

    public static int findLucky(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] array = new int[501];
        for(int n : arr) array[n]++;
        for(int n : arr) if(array[n] == n) max = Math.max(max, n);
        return Math.max(max, -1);
    }
}
