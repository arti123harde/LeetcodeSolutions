package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestNumberAtLeastTwiceOfOthers {

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3,6,1,0}));
        System.out.println(dominantIndex(new int[]{1,2,3,4}));
    }

    public static int dominantIndex(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        if(nums[nums.length-2] * 2 <= nums[nums.length-1]) return map.get(nums[nums.length-1]);
        else return -1;
    }
}
