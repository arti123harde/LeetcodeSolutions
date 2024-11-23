package org.solutions.leetcode.array.easy;

import java.util.List;

/**
 * @author Arti Harde
 */
public class SumOfValuesAtIndicesWithKSetBits {

    public static void main(String[] args) {
        System.out.println(sumIndicesWithKSetBits(List.of(5,10,1,5,2), 1));
        System.out.println(sumIndicesWithKSetBits(List.of(4,3,2,1), 2));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        Integer[] array = nums.toArray(new Integer[0]);
        for (int i = 0; i< array.length; i++) {
            String s = Integer.toBinaryString(i);
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') count++;
            }
            if (count == k) sum += array[i];
        }
        return sum;
    }
}