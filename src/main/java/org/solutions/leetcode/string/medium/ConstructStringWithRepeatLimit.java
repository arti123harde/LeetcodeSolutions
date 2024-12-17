package org.solutions.leetcode.string.medium;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class ConstructStringWithRepeatLimit {

    public static void main(String[] args) {
        System.out.println(repeatLimitedString("cczazcc", 3));
        System.out.println(repeatLimitedString("aababab", 2));
    }

    public static String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> Character.compare(b, a));
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        queue.addAll(map.keySet());
        while (!queue.isEmpty()){
            char c = queue.poll();
            int minCount = Math.min(map.get(c), repeatLimit);
            stringBuilder.repeat(c, minCount);
            map.put(c, map.get(c) - minCount);
            if (map.get(c) > 0 && !queue.isEmpty()) {
                char c1 = queue.poll();
                stringBuilder.append(c1);
                map.put(c1, map.get(c1) - 1);
                if (map.get(c1) > 0) queue.offer(c1);
                queue.add(c);
            }
        }
        return stringBuilder.toString();
    }
}
