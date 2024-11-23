package org.solutions.leetcode.string.easy;

public class FindOriginalTypedStringI {

    public static void main(String[] args) {
        System.out.println(possibleStringCount("abbcccc"));
        System.out.println(possibleStringCount("abcd"));
        System.out.println(possibleStringCount("aaaa"));
    }

    public static int possibleStringCount(String word) {
//        int count = 1;
//        Map<Character, Integer> map = new HashMap<>();
//        for(char c : word.toCharArray()){
//            map.put(c,  map.getOrDefault(c, 0) + 1);
//        }
//        for(Map.Entry<Character, Integer> entry : map.entrySet()){
//            if(entry.getValue() > 1) count+= (entry.getValue() - 1);
//        }
//        return count;

        int count = 1;
        char lastChar = word.charAt(0);
        for(int i=1; i<word.length(); i++){
            if(lastChar == word.charAt(i)) count++;
            lastChar = word.charAt(i);
        }
        return count;
    }
}
