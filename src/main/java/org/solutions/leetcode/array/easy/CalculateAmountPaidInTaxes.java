package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CalculateAmountPaidInTaxes {

    public static void main(String[] args) {
        System.out.println(calculateTax(new int[][]{{3, 50}, {7, 10}, {12, 25}}, 10));
        System.out.println(calculateTax(new int[][]{{1, 0}, {4, 25}, {5, 50}}, 2));
    }

    public static double calculateTax(int[][] brackets, int income) {
        double tax = 0.0;
        int last = 0;
        for(int[] bracket : brackets){
            int current = Math.min(income, bracket[0]);
            tax += ((double) ((current - last) * bracket[1]) / 100);
            last = bracket[0];
            if(income <= bracket[0]) break;
        }
        return tax;
    }
}
