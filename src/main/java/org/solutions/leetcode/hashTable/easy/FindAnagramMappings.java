package org.solutions.leetcode.hashTable.easy;

import org.solutions.leetcode.string.easy.PrintUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class FindAnagramMappings {

    public static void main(String[] args) {
        PrintUtil.printArray(anagramMappings(new int[]{12,28,46,32,50},
                new int[]{50,12,32,46,28}));
        PrintUtil.printArray(anagramMappings(new int[]{84,46},
                new int[]{84,46}));
        PrintUtil.printArray(anagramMappings(new int[]{21,5,74,5,74,21},
                new int[]{21,5,74,74,5,21}));
    }

    public static int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums2.length; i++){
            map.put(nums2[i], i);
        }
        for(int j=0; j< nums1.length; j++){
            result[j] = map.get(nums1[j]);
        }
        return result;
    }

    public static int[] anagramMappings1(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        for (int k : nums1) {
            int s = -1;
            for (int j = 0; j < nums1.length; j++) {
                if (k == nums2[j]) {
                    s  = j;
                }
            }
            result.add(s);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}