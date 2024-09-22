package org.solutions.leetcode.string.hard;

/**
 * @author Arti Harde
 */
public class StringPasswordChecker {

    public static void main(String[] args) {
        System.out.println(strongPasswordChecker("1111111111"));
        System.out.println(strongPasswordChecker("aaa111"));
        System.out.println(strongPasswordChecker("aaAA11"));
        System.out.println(strongPasswordChecker("aaa123"));
        System.out.println(strongPasswordChecker("a"));
        System.out.println(strongPasswordChecker("aA1"));
        System.out.println(strongPasswordChecker("1337C0d3"));
    }

    public static int strongPasswordChecker(String password) {
        int count = 0;
        if(password.length() < 6){
            count = 6 - password.length();
        }else if(password.length() > 20){
            count =  password.length() - 20;
        }
        return count;
    }
}