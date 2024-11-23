package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class MinimumNumberOfStepsToMakeTwoStringsAnagram2 {

    public static void main(String[] args) {
        System.out.println(minSteps("leetcode", "coats"));
        System.out.println(minSteps("night", "thing"));
    }

    public static int minSteps(String s, String t) {
        int count = 0;
        int[] sc = new int[26];
        int[] tc = new int[26];
        for(int i=0; i<s.length(); i++){
            sc[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            tc[t.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            count = count + Math.abs(sc[i] - tc[i]);
        }
        return count;
    }
}