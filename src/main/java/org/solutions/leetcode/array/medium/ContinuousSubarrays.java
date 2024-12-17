package org.solutions.leetcode.array.medium;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class ContinuousSubarrays {

    public static void main(String[] args) {
        System.out.println(continuousSubarrays(new int[]{5,4,2,4}));
    }

    public static long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> count = new TreeMap<>();
        int i = 0;
        int j = 0;
        long k = 0;
        while (j < nums.length) {
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
            while (count.lastEntry().getKey() - count.firstEntry().getKey() > 2) {
                count.put(nums[i], count.get(nums[i]) - 1);
                if (count.get(nums[i]) == 0)  count.remove(nums[i]);
                i++;
            }
            k += (j - i + 1);
            j++;
        }
        return k;
    }
}
