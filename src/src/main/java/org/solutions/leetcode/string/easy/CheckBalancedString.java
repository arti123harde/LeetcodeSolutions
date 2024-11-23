package org.solutions.leetcode.string.easy;

public class CheckBalancedString {

    public static void main(String[] args) {
        System.out.println(isBalanced("1234"));
        System.out.println(isBalanced("24123"));
    }

    public static boolean isBalanced(String num) {
//        int evenSum = 0;
//        int oddSum = 0;
//        for(int i=0; i<num.length(); i++){
//            int sum = Integer.parseInt(String.valueOf(num.charAt(i)));
//            if(i % 2 == 0) evenSum += sum;
//            else oddSum += sum;
//        }
//        return evenSum == oddSum;

        int sum = 0;
        for(int i=0; i<num.length(); i++){
            int s1 = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(i % 2 == 0) sum += s1;
            else sum -= s1;
        }
        return sum == 0;
    }
}
