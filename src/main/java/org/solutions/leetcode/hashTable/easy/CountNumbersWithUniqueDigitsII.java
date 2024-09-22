package org.solutions.leetcode.hashTable.easy;

/**
 * @author Arti Harde
 */
public class CountNumbersWithUniqueDigitsII {

    public static void main(String[] args) {
        System.out.println(numberCount(1, 20));
        System.out.println(numberCount(9, 19));
        System.out.println(numberCount(80, 120));
    }

    public static int numberCount(int a, int b) {
        int count = 0;
        for(int i=a; i<=b ; i++){
            String s = String.valueOf(i);
            if(s.length() == 1){
                count++;
            }else if(s.length() == 2 && s.charAt(0) != s.charAt(1)){
                count++;
            }else if(s.length() == 3 && s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2)
            && s.charAt(0) != s.charAt(2)){
                count++;
            }
        }
        return count;
    }
}