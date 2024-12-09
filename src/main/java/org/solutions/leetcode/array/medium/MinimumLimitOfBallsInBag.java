package org.solutions.leetcode.array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Arti Harde
 */
public class MinimumLimitOfBallsInBag {

    public static void main(String[] args) {
        System.out.println(minimumSize(new int[]{2,4,8,2}, 4));
        System.out.println(minimumSize(new int[]{9}, 2));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();
        while (l < r){
            int m = (l + r) / 2;
            if(isValidDivision(nums, m, maxOperations)) r = m;
            else l = m + 1;
        }
        return l;
    }

    private static boolean isValidDivision(int[] nums, int maxBalls, int maxOps){
        int totalOps = 0;
        for(int n : nums){
            int ops = (int) Math.ceil(n / (double) maxBalls) - 1;
            totalOps += ops;
            if(totalOps > maxOps) return false;
        }
        return true;
    }
}
