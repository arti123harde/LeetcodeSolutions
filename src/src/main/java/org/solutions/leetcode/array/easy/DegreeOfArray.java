package org.solutions.leetcode.array.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1}));
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

    public static int findShortestSubArray(int[] nums) {
        int result = nums.length;
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!count.containsKey(nums[i])){
                start.put(nums[i], i);
            }
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            end.put(nums[i], i);
        }
        int max = Collections.max(count.values());
        for(int n : count.keySet()){
            if(count.get(n) == max){
                result = Math.min(result, end.get(n) - start.get(n) + 1);
            }
        }
        return result;
    }
}
