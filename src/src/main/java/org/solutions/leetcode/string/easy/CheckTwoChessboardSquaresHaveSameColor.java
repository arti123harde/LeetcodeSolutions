package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CheckTwoChessboardSquaresHaveSameColor {

    public static void main(String[] args) {
        System.out.println(checkTwoChessboards("a1", "h3"));
        System.out.println(checkTwoChessboards("a1", "c3"));
    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return Objects.equals(findColor(coordinate1), findColor(coordinate2));
    }

    private static String findColor(String coordinate){
        List<Character> white = Arrays.asList('b', 'd', 'f', 'h');
        List<Character> black = Arrays.asList('a', 'c', 'e', 'g');
        int i = Integer.parseInt(String.valueOf(coordinate.charAt(1))) % 2;
        if(white.contains(coordinate.charAt(0))){
            return i == 0 ? "Black" : "White";
        }else if(black.contains(coordinate.charAt(0))){
            return i == 1 ? "Black" : "White";
        }
        return null;
    }
}
