package org.solutions.leetcode.string.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Arti Harde
 */
public class BetterCompressionOfString {

    public static void main(String[] args) {
        System.out.println(betterCompression("i10g6u6"));
        System.out.println(betterCompression("e2e9t6"));
        System.out.println(betterCompression("a3c9b2c1"));
        System.out.println(betterCompression("c2b3a1"));
        System.out.println(betterCompression("a2b4c1"));
    }

    public static String betterCompression(String compressed) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        while (i < compressed.length()){
            char c = compressed.charAt(i);
            i++;
            StringBuilder num = new StringBuilder();
            while (i < compressed.length() && Character.isDigit(compressed.charAt(i))){
                num.append(compressed.charAt(i));
                i++;
            }
            map.put(c, Integer.parseInt(num.toString()) + map.getOrDefault(c, 0));
        }
        LinkedHashMap<Character, Integer> tempMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for(Map.Entry<Character, Integer> entry : tempMap.entrySet()){
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }

}