package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class HeightChecker {

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
    }

    public static int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        int count = 0;
        Arrays.sort(sorted);
        for(int j=0; j<heights.length; j++) if(heights[j] != sorted[j]) count++;
        return count;
    }
}
