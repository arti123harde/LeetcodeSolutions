package org.solutions.leetcode.array.easy;

import java.util.List;

/**
 * @author Arti Harde
 */
public class MinimumPositiveSumSubarray {

    public static void main(String[] args) {
        System.out.println(minimumSumSubarray(List.of(3, -2, 1, 4), 2, 3));
    }

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int count = 1;
            int sum = 0;
            for (int j = i; j < nums.size(); j++) {
                sum += nums.get(j);
                if (l <= count && count <= r) if (sum > 0 && sum < min)  min = sum;
                if (count > r)  break;
                count++;
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}
