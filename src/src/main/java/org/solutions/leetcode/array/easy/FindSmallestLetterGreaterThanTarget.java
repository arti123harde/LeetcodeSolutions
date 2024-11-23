package org.solutions.leetcode.array.easy;

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
        System.out.println(nextGreatestLetter(new char[]{'x','x','y','y'}, 'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters){
            if (c > target) return c;
        }
        return letters[0];
    }
}
