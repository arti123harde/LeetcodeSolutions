package org.solutions.leetcode.dp.medium;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class CountWaysToBuildGoodStrings {

    public static void main(String[] args) {
        System.out.println(countGoodStrings(3,3,1,1));
    }

    static int[] dp;
    static int mod = 1_000_000_007;

    public static int countGoodStrings(int low, int high, int zero, int one) {
        dp = new int[high + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        int count = 0;
        for (int end = low; end <= high; ++end) {
            count += dfs(end, zero, one);
            count %= mod;
        }
        return count;
    }

    private static int dfs(int end, int zero, int one) {
        if (dp[end] != -1)  return dp[end];
        int count = 0;
        if (end >= one) count += dfs(end - one, zero, one);
        if (end >= zero) count += dfs(end - zero, zero, one);
        dp[end] = count % mod;
        return dp[end];
    }
}
