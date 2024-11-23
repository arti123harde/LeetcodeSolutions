package org.solutions.leetcode.string.easy;

public class FindEncryptedString {

    public static void main(String[] args) {
        System.out.println(getEncryptedString("byd", 4));
        System.out.println(getEncryptedString("dart", 3));
        System.out.println(getEncryptedString("aaa", 1));
    }

    public static String getEncryptedString(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int n = i + k;
            while (n >= s.length()){
                n -= s.length();
            }
            result.append(s.charAt(n));
        }
        return result.toString();
    }
}
