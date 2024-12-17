package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class TheTwoSneakyNumbersOfDigitville {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0,1,1,0})));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i=0;
        int[] result = new int[2];
        for(int n : nums) if(!set.add(n)) result[i++] = n;
        return result;
    }
}
