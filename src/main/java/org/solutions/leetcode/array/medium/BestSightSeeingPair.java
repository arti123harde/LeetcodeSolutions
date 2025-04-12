package org.solutions.leetcode.array.medium;

/**
 * @author Arti Harde
 */
public class BestSightSeeingPair {

    public static void main(String[] args) {
        System.out.println(maxScoreSightseeingPair(new int[]{8,1,5,2,6}));
    }

    private static int maxScoreSightseeingPair(int[] values){
        int n = values.length;
        int left = values[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            int current = values[i] - i;
            max = Math.max(max, left + current);
            int currentLeft = values[i] + i;
            left = Math.max(left, currentLeft);
        }
        return max;
    }

}
