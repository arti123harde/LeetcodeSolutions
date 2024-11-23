package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class CountSubstringsWithoutRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(numberOfSpecialSubstrings("abcd"));
        System.out.println(numberOfSpecialSubstrings("ooo"));
        System.out.println(numberOfSpecialSubstrings("abab"));
    }

    public static int numberOfSpecialSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int[] chars = new int[26];
            for(int j=i; j<s.length(); j++){
                if(chars[s.charAt(j) - 'a'] == 1){
                    break;
                }else{
                    chars[s.charAt(j) - 'a'] = 1;
                    count++;
                }
            }
        }
        return count;
    }
}