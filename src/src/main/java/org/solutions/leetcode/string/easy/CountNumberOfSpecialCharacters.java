package org.solutions.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class CountNumberOfSpecialCharacters {

    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("aaAbcBC"));
        System.out.println(numberOfSpecialChars("abc"));
        System.out.println(numberOfSpecialChars("abBCab"));
    }

    public static int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            if(Character.isLowerCase(word.charAt(i)) && !set.contains(word.charAt(i)) && word.contains(String.valueOf(word.charAt(i)).toUpperCase())){
                set.add(word.charAt(i));
            }
        }
        return set.size();
    }
}