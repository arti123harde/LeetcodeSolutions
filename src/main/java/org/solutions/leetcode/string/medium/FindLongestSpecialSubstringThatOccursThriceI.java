package org.solutions.leetcode.string.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class FindLongestSpecialSubstringThatOccursThriceI {

    public static void main(String[] args) {
        System.out.println(maximumLength("aaaa"));
    }

    public static int maximumLength(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length()-1; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<s.length(); j++){
                if(sb.isEmpty() || sb.charAt(sb.length()-1) == s.charAt(j)) {
                    sb.append(s.charAt(j));
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                }else break;
            }
        }
        int maxLen = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 3 && entry.getKey().length() > maxLen) maxLen = entry.getKey().length();
        }
        return maxLen == 0 ? -1 : maxLen;
    }
}
