package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class AppendCharactersToStringToMakeSubsequence {

    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching", "coding"));
        System.out.println(appendCharacters("abcde", "a"));
        System.out.println(appendCharacters("z", "abcde"));
    }

    public static int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while (i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length() - j;
    }
}