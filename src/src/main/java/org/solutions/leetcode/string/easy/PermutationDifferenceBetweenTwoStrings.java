package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class PermutationDifferenceBetweenTwoStrings {

    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum = sum + Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return sum;
    }
}