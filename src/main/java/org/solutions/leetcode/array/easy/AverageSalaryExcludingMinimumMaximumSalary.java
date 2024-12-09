package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class AverageSalaryExcludingMinimumMaximumSalary {

    public static void main(String[] args) {
        System.out.println(average(new int[]{4000,3000,1000,2000}));
        System.out.println(average(new int[]{1000,2000,3000}));
    }

    public static double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int totalSum = 0;
        for (int n : salary) {
            totalSum += n;
            minSalary = Math.min(minSalary, n);
            maxSalary = Math.max(maxSalary, n);
        }
        return (double)(totalSum - minSalary - maxSalary) / (double)(salary.length - 2);
    }
}
