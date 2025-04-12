package org.solutions.leetcode.string.medium;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Arti Harde
 */
public class CountVowelStringsInRanges {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"},
                new int[][]{{0, 2}, {1, 4}, {1, 1}})));
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] prefixSum = new int[words.length];
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            String start = String.valueOf(words[i].charAt(0));
            String end = String.valueOf(words[i].charAt(words[i].length()-1));
            if ("aeiou".contains(start) && "aeiou".contains(end)) sum++;
            prefixSum[i] = sum;
        }
        for (int i = 0; i < queries.length; i++) ans[i] = prefixSum[queries[i][1]] - (queries[i][0] == 0 ? 0 : prefixSum[queries[i][0] - 1]);
        return ans;
    }
}
