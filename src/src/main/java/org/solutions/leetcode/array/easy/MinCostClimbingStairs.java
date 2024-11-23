package org.solutions.leetcode.array.easy;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] minimumCost = new int[cost.length + 1];
        for (int i = 2; i < minimumCost.length; i++) {
            int takeOneStep = minimumCost[i - 1] + cost[i - 1];
            int takeTwoSteps = minimumCost[i - 2] + cost[i - 2];
            minimumCost[i] = Math.min(takeOneStep, takeTwoSteps);
        }
        return minimumCost[minimumCost.length - 1];
    }
}
