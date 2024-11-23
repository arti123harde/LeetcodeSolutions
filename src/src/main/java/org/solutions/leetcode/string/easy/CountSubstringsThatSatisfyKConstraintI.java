package org.solutions.leetcode.string.easy;

public class CountSubstringsThatSatisfyKConstraintI {

    public static void main(String[] args) {
        System.out.println(countKConstraintSubstrings("10101", 1));
        System.out.println(countKConstraintSubstrings("1010101", 2));
        System.out.println(countKConstraintSubstrings("11111", 1));
    }

    public static int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for(int i=0 ;i<s.length(); i++){
            int n0 = 0;
            int n1 = 0;
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j) == '0') n0++;
                if(s.charAt(j) == '1') n1++;
                if(n0<=k || n1<=k) count++;
            }
        }
        return count;
    }
}
