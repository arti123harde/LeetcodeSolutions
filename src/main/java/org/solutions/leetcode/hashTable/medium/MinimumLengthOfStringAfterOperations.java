package org.solutions.leetcode.hashTable.medium;

import java.util.Map;

/**
 * @author Arti Harde
 */
public class MinimumLengthOfStringAfterOperations {

    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb"));
        System.out.println(minimumLength("aa"));
    }

    public static int minimumLength(String s) {
        int len = 0;
        int[] chars = new int[26];
        for(char c : s.toCharArray()) chars[c - 'a']++;
        for(int f : chars) {
            if(f == 0) continue;
            if(f % 2 == 0) len += 2;
            else len++;
        }
        return len;
    }
}
