package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MaximumNumberOfPairsInArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2})));
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1,1})));
    }

    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        int pairs = 0;
        int left = 0;
        for(int k : map.keySet()){
            pairs += (map.get(k) / 2);
            left += (map.get(k) % 2);
        }
        return new int[]{pairs, left};
    }


}
