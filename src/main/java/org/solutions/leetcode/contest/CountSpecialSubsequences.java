package org.solutions.leetcode.contest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class CountSpecialSubsequences {

    public static void main(String[] args) {
        System.out.println(numberOfSubsequences(new int[]{1,2,3,4,3,6,1}));
    }

    public static long numberOfSubsequences(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Map to store the frequency of products of pairs (p, q)
        Map<Integer, Integer> productMap = new HashMap<>();

        // Store products of pairs (p, q) where p < q, and q - p > 1
        for (int p = 0; p < n - 3; p++) {
            for (int q = p + 2; q < n - 2; q++) {
                int product = nums[p] * nums[q];
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }

        // Now, iterate through pairs (r, s) where r > q + 1 and s > r + 1
        for (int r = 2; r < n - 1; r++) {
            for (int s = r + 2; s < n; s++) {
                int product = nums[r] * nums[s];
                // If the product exists in the map, add the count of how many times it appeared
                count += productMap.getOrDefault(product, 0);
            }
        }

        return count;
    }
}
