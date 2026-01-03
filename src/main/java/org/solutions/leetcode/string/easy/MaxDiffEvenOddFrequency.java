package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MaxDiffEvenOddFrequency {

    public static void main(String[] args) {
        System.out.println(maxDifference("aaaaabbc"));
    }

    public static int maxDifference(String s) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()) arr[c - 'a']++;
        int maxOdd = 0;
        int minEven = 101;
        for(int i : arr){
            if(i % 2 == 0) minEven = Math.min(i==0 ? 101 : i, minEven);
            else maxOdd = Math.max(maxOdd, i);
        }
        return maxOdd - minEven;
    }

    public static int maxDifference1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c ,0) + 1);
        }
        int maxOdd = 0;
        int minEven = 101;
        for(int i : map.values()){
            if(i % 2 == 0) minEven = Math.min(minEven, i);
            else maxOdd = Math.max(maxOdd, i);
        }
        return maxOdd - minEven;
    }
}
