package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ValidWord {

    public static void main(String[] args) {
        System.out.println(isValid("234Adas"));
        System.out.println(isValid("b3"));
    }

    public static boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        if(!word.matches(".*[aeiouAEIOU].*")){
            return false;
        }
        if(!word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*")){
            return false;
        }
        if(word.matches(".*[@#$]")){
            return false;
        }
        return true;
    }

}