package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.utils.PrintUtil;

/**
 * @author Arti Harde
 */
public class PlusOne {

    public static void main(String[] args) {
        PrintUtil.printArray(plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6}));
        PrintUtil.printArray(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
        PrintUtil.printArray(plusOne(new int[]{9}));
        PrintUtil.printArray(plusOne(new int[]{1,2,3}));
        PrintUtil.printArray(plusOne(new int[]{4,3,2,1}));
    }

    public static int[] plusOne(int[] digits) {
        for(int i= digits.length-1; i>=0; i--){
            digits[i]++;
            if(digits[i] < 10){
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}