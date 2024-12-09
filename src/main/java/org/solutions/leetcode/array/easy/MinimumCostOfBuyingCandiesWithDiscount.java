package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MinimumCostOfBuyingCandiesWithDiscount {

    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{6,5,7,9,2,2}));
        System.out.println(minimumCost(new int[]{1,2,3}));
    }

    public static int minimumCost(int[] cost) {
        if(cost.length == 1) return cost[0];
        else if(cost.length == 2) return cost[0] + cost[1];
        int sum = 0;
        Arrays.sort(cost);
        int i = cost.length-1;
        while(i >= 0){
            if(i > 0) sum += (cost[i] + cost[i-1]);
            else sum += cost[i];
            i -= 3;
        }
        return sum;
    }
}
