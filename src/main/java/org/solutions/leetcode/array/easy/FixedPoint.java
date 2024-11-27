package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FixedPoint {

    public static void main(String[] args) {
        System.out.println(fixedPoint(new int[]{-10,-5,0,3,7}));
        System.out.println(fixedPoint(new int[]{0,2,5,8,17}));
        System.out.println(fixedPoint(new int[]{-10,-5,3,4,7,9}));
    }

    public static int fixedPoint(int[] arr) {
        for(int i=0; i< arr.length; i++) if(i == arr[i]) return i;
        return -1;
    }
}
