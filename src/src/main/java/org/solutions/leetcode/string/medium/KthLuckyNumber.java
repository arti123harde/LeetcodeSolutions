package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class KthLuckyNumber {

    public static void main(String[] args) {
        System.out.println(kthLuckyNumber(4));
        System.out.println(kthLuckyNumber(10));
        System.out.println(kthLuckyNumber(1000));
    }

    public static String kthLuckyNumber(int k) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = Integer.toBinaryString(k+1);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                stringBuilder.append("4");
            }else{
                stringBuilder.append("7");
            }
        }
        return stringBuilder.toString();
    }
}