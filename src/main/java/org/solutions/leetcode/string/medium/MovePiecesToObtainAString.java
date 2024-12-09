package org.solutions.leetcode.string.medium;

import java.util.Objects;

/**
 * @author Arti Harde
 */
public class MovePiecesToObtainAString {

    public static void main(String[] args) {
        System.out.println(canChange("_L__R__R_", "L______RR"));
        System.out.println(canChange("R_L_", "__LR"));
    }

    public static boolean canChange(String start, String target) {
        if(start.length() != target.length()) return false;
        int i = 0;
        int j = 0;
        int N = start.length();
        while (i < N || j < N){
            while (i < N && start.charAt(i) == '_') i++;
            while (j < N && target.charAt(j) == '_') j++;
            if(i == N || j == N) return i == N && j == N;
            if(start.charAt(i) != target.charAt(j) || (start.charAt(i) == 'L' && i < j) || (start.charAt(i) == 'R' && i > j)) return false;
            i++;
            j++;
        }
        return true;
    }
}
