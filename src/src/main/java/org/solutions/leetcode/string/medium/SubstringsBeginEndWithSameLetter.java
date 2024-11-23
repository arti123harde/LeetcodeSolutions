package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class SubstringsBeginEndWithSameLetter {

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcba"));
        System.out.println(numberOfSubstrings("abacad"));
        System.out.println(numberOfSubstrings("a"));
    }

    public static long numberOfSubstrings(String s) {
        long count = 0;
        long[] frequencyCount = new long[26];
        for (char ch : s.toCharArray()) {
            frequencyCount[ch - 'a']++;
        }
        for (long currentCount : frequencyCount) {
            count += ((currentCount + 1) * currentCount) / 2;
        }
        return count;
    }
}