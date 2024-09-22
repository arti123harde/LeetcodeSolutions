package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MaximumLengthSubstringTwoOccurrences {

    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("bcbbbcba"));
        System.out.println(maximumLengthSubstring("aaaa"));
    }

    public static int maximumLengthSubstring(String s) {
        int max = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String s1 = s.substring(i, j+1);
                Map<Character, Integer> map = new HashMap<>();
                for(int k=0; k<s1.length(); k++){
                    map.put(s1.charAt(k), map.getOrDefault(s1.charAt(k), 0) + 1);
                }
                if(map.values().stream().noneMatch(m -> m > 2) && s1.length() > max){
                    max = s1.length();
                }
            }
        }
        return max;
    }
}