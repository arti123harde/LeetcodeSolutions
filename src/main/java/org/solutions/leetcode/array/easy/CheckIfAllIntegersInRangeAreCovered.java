package org.solutions.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class CheckIfAllIntegersInRangeAreCovered {

    public static void main(String[] args) {
        System.out.println(isCovered(new int[][]{{1, 50}}, 1, 50));
        System.out.println(isCovered(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        for (int j = left; j <= right; j++) {
            boolean isCovered = false;
            for (int[] range : ranges) {
                if (j >= range[0] && j <= range[1]) {
                    isCovered = true;
                    break;
                }
            }
            if (!isCovered) return false;
        }
        return true;
    }
}
