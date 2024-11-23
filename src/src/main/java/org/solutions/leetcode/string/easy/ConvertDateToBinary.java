package org.solutions.leetcode.string.easy;

public class ConvertDateToBinary {

    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
        System.out.println(convertDateToBinary("1900-01-01"));
    }

    public static String convertDateToBinary(String date) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4)))).append("-");
        stringBuilder.append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7)))).append("-");
        stringBuilder.append(Integer.toBinaryString(Integer.parseInt(date.substring(8))));
        return stringBuilder.toString();

//        return Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))) + "-" +
//                Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))) + "-" +
//                Integer.toBinaryString(Integer.parseInt(date.substring(8)));
    }
}
