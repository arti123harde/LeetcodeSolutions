package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class AddingSpacesToString {

    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[]{8,13,15}));
        System.out.println(addSpaces("icodeinpython", new int[]{1,5,7,9}));
        System.out.println(addSpaces("spacing", new int[]{0,1,2,3,4,5,6}));
    }

    public static String addSpaces(String s, int[] spaces) {
//        StringBuilder sb = new StringBuilder();
//        int startIndex = 0;
//        for (int space : spaces) {
//            sb.append(s, startIndex, space).append(" ");
//            startIndex = space;
//        }
//        return sb.append(s, startIndex, s.length()).toString();

        char[] chars = new char[s.length() + spaces.length];
        int k = 0;
        int index = 0;
        for(int i=0; i<s.length(); i++){
            if(index < spaces.length && spaces[index] == i) {
                chars[k++] = ' ';
                index++;
            }
            chars[k++] = s.charAt(i);
        }
        return new String(chars);
    }
}
