package org.solutions.leetcode.string.medium;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MaximumPalindromesAfterOperations {

    public static void main(String[] args) {
        System.out.println(maxPalindromesAfterOperations(new String[]{"abbb","ba","aa"}));
    }

    public static int maxPalindromesAfterOperations(String[] words) {
        int[] wordLength = new int[words.length];
        int[] chars = new int[26];
        for(int i=0; i< words.length; i++){
            wordLength[i] = words[i].length();
            for(char c : words[i].toCharArray()){
                chars[c - 'a']++;
            }
        }
        int even = 0;
        int odds = 0;
        int palindromes = 0;
        Arrays.sort(wordLength);
        for(int i=0; i<chars.length; i++){
            if(chars[i] % 2 != 0){
                odds++;
                chars[i]--;
            }
            even += chars[i]/2;
        }
        for(int i=0; i<wordLength.length; i++){
            if(wordLength[i] % 2 != 0 && odds > 0){
                odds--;
                wordLength[i]--;
            } else if(wordLength[i] % 2 != 0 && even > 0){
                even--;
                odds++;
                wordLength[i]--;
            }
            if(wordLength[i] % 2 == 0 && even >= (wordLength[i]/2)){
                even -= (wordLength[i]/2);
                wordLength[i] = 0;

            }
            if(even < (wordLength[i]/2)) break;
            palindromes++;
        }
        return palindromes;
    }
}
