package org.solutions.leetcode.string.medium;

import java.util.Objects;

/**
 * @author Arti Harde
 */
public class MakeStringASubsequenceUsingCyclicIncrements {

    public static void main(String[] args) {
        System.out.println(canMakeSubsequence("abc", "ad"));
        System.out.println(canMakeSubsequence("zc", "ad"));
        System.out.println(canMakeSubsequence("ab", "d"));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        StringBuilder s = new StringBuilder();
        while (i< str1.length() && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j) || str1.charAt(i) + 1 == str2.charAt(j)
                || (str1.charAt(i) == 'z' && str2.charAt(j) == 'a')){
                s.append(str2.charAt(j));
                i++;
                j++;
            }else {
                i++;
            }
        }
        return Objects.equals(s.toString(), str2);
    }
}
