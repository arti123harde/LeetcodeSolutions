package org.solutions.leetcode.string.hard;

/**
 * @author Arti Harde
 */
public class NumberOfWaysToFormATargetStringGivenADictionary {

    public static void main(String[] args) {
        System.out.println(numWays(new String[]{"acca","bbbb","caca"}, "aba"));
        System.out.println(numWays(new String[]{"abba","baab"}, "bab"));
    }

    public static int numWays(String[] words, String target) {
        int n = words[0].length();
        int m = target.length();
        int mod = 1000000007;
        int[] dp = new int[m+1];
        dp[0] = 1;
        int[][] count = new int[n][26];
        for (String word : words) for (int i = 0; i < n; i++) count[i][word.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) {
            for (int j = m-1; j >= 0; j--) {
                dp[j+1] += (int)((long)dp[j] * count[i][target.charAt(j) - 'a'] % mod);
                dp[j+1] %= mod;
            }
        }
        return dp[m];
    }
}
