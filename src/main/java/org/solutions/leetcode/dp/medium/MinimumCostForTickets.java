package org.solutions.leetcode.dp.medium;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MinimumCostForTickets {

    public static void main(String[] args) {
        System.out.println(mincostTickets(new int[]{1,4,6,7,8,20}, new int[]{2,7,15}));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];
        Arrays.fill(dp, 0);
        int i = 0;
        for (int day = 1; day <= lastDay; day++) {
            if (day < days[i]) dp[day] = dp[day - 1];
            else {
                i++;
                dp[day] = Math.min(dp[day - 1] + costs[0], Math.min(dp[Math.max(0, day - 7)] + costs[1], dp[Math.max(0, day - 30)] + costs[2]));
            }
        }
        return dp[lastDay];
    }
}
