package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class ComplexNumberMultiplication {

    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+1i", "1+1i"));
        System.out.println(complexNumberMultiply("1+-1i", "1+-1i"));
    }

    public static String complexNumberMultiply(String num1, String num2) {
        String[] firstNum = num1.split("\\+");
        String[] secondNum = num2.split("\\+");
        int a = Integer.parseInt(firstNum[0]);
        int b = Integer.parseInt(firstNum[1].substring(0, firstNum[1].length()-1));
        int c = Integer.parseInt(secondNum[0]);
        int d = Integer.parseInt(secondNum[1].substring(0, secondNum[1].length()-1));
        int m1 = (a * c) - (b * d);
        int m2 = (a * d) + (b * c);
        return m1 + "+" + m2 + "i";
    }
}