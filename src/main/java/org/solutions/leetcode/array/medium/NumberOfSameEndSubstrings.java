package org.solutions.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class NumberOfSameEndSubstrings {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sameEndSubstringCount("abcaab", new int[][]{{0, 0}, {1, 4}, {2, 5}, {0, 5}})));
        System.out.println(Arrays.toString(sameEndSubstringCount("abcd", new int[][]{{0, 3}})));
    }

    public static int[] sameEndSubstringCount(String s, int[][] queries) {
        Map<Character, List<Integer>> map = new HashMap<>();
        int[] result = new int[queries.length];
        for(int i=0; i<s.length(); i++){
            map.putIfAbsent(s.charAt(i), new ArrayList<>());
            map.get(s.charAt(i)).add(i);
        }
        int k = 0;
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            int sum = 0;
            Set<Character> added = new HashSet<>();
            for(char c : map.keySet()){
                if(added.add(c)){
                    int left = findLeft(map.get(c), start);
                    int right = findRight(map.get(c), end);
                    int count = right - left;
                    sum += ((count * (count + 1)) / 2);
                }
            }
            result[k++] = sum;
        }
        return result;
    }

    private static int findLeft(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private static int findRight(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) <= target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
