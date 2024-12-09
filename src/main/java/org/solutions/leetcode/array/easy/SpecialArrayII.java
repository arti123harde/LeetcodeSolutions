package org.solutions.leetcode.array.easy;


import java.util.ArrayList;
import java.util.Arrays;



/**
 * @author Arti Harde
 */
public class SpecialArrayII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isArraySpecial(new int[]{3,7,3,10,5,5}, new int[][]{{3, 4}, {1, 5}, {5, 5}, {0, 4}, {1, 2}, {2, 3}, {5, 5}, {0, 1}})));
        System.out.println(Arrays.toString(isArraySpecial(new int[]{7,5,1,8,1,1}, new int[][]{{0, 3}, {0, 1}, {5, 5}})));
        System.out.println(Arrays.toString(isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 4}})));
        System.out.println(Arrays.toString(isArraySpecial(new int[]{4,3,1,6}, new int[][]{{0,2}, {2, 3}})));
    }

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        ArrayList<Integer> violatingIndices = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) if (nums[i] % 2 == nums[i - 1] % 2) violatingIndices.add(i);
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            boolean foundViolatingIndex = binarySearch(start + 1, end, violatingIndices);
            ans[i] = !foundViolatingIndex;
        }
        return ans;
    }

    private static boolean binarySearch(int start, int end, ArrayList<Integer> violatingIndices) {
        int left = 0;
        int right = violatingIndices.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int violatingIndex = violatingIndices.get(mid);
            if (violatingIndex < start)  left = mid + 1;
            else if (violatingIndex > end) right = mid - 1;
            else return true;
        }
        return false;
    }

}