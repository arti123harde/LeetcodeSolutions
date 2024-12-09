package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class IntersectionOfMultipleArrays {

    public static void main(String[] args) {
        System.out.println(intersection(new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}));
        System.out.println(intersection(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    public static List<Integer> intersection(int[][] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int[] arr = new int[1001];
        List<Integer> result = new ArrayList<>();
        for (int[] i : nums) {
            for (int j : i) {
                max = Math.max(max, j);
                min = Math.min(min, j);
                arr[j]++;
            }
        }
        for(int i=min; i<=max; i++) if(arr[i] >= n) result.add(i);
        return result;
    }
}
