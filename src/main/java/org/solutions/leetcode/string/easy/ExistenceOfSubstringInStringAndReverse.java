package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ExistenceOfSubstringInStringAndReverse {

    public static void main(String[] args) {
        System.out.println(isSubstringPresent("ausoee"));
        System.out.println(isSubstringPresent("leetcode"));
        System.out.println(isSubstringPresent("abcba"));
        System.out.println(isSubstringPresent("abcd"));
    }

    public static boolean isSubstringPresent(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        for(int i=0; i<s.length()-1; i++){
            String s1 = s.substring(i, i+2);
            if(reverse.contains(s1)){
                return true;
            }
        }
        return false;
    }
}