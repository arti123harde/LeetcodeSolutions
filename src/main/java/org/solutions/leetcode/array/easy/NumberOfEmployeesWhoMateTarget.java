package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class NumberOfEmployeesWhoMateTarget {

    public static void main(String[] args) {
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{0,1,2,3,4}, 2));
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{5,1,4,2,2}, 6));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) count++;
        }
        return count;
    }
}