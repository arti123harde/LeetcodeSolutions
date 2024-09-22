package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindTheHighestAltitude {

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int prevAltitude = 0;
        for (int j : gain) {
            prevAltitude = prevAltitude + j;
            max = Math.max(max, prevAltitude);
        }
        return max;
    }
}