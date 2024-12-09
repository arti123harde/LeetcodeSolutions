package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MostFrequentNumberFollowingKeyInArray {

    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[]{2,2,2,2,3}, 2));
        System.out.println(mostFrequent(new int[]{1,100,200,1,100}, 1));
    }

    public static int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length-1; i++) if(nums[i] == key) map.put(nums[i+1], map.getOrDefault(nums[i+1], 0) + 1);
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int k : map.keySet()){
            if(max < map.get(k)){
                num = k;
                max = map.get(k);
            }
        }
        return num;
    }
}
