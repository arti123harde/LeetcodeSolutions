package org.solutions.leetcode.array.easy;

import java.util.List;

public class ValidWordSquare {

    public static void main(String[] args) {
        System.out.println(validWordSquare(List.of("ball","area","read","lady")));
        System.out.println(validWordSquare(List.of("abcd","bnrt","crmy","dtye")));
        System.out.println(validWordSquare(List.of("abcd","bnrt","crm","dt")));
    }

    public static boolean validWordSquare(List<String> words) {
        for(int j=0; j<words.size(); j++){
            StringBuilder str = new StringBuilder();
            for (String word : words) {
                if(word.length() > j) str.append(word.charAt(j));
            }
            if(!words.get(j).contentEquals(str)) return false;
        }
        return true;
    }
}
