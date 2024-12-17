package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class FindXSumOfAllKLongSubarraysI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findXSum(new int[]{9,2,2}, 3, 3)));
        System.out.println(Arrays.toString(findXSum(new int[]{1,1,2,2,3,4,2,3}, 6, 2)));
        System.out.println(Arrays.toString(findXSum(new int[]{3,8,7,8,7,5}, 2, 2)));
    }

    public static int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length - k + 1];
        Map<Integer, Integer> map = new TreeMap<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
            if (!Objects.equals(a[1], b[1])) return b[1] - a[1];
            else return b[0] - a[0];
        });
        for(int i=0; i<nums.length - k + 1; i++){
            map.clear();
            queue.clear();
            for(int j=i; j<i+k; j++) map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            for(int key : map.keySet()) queue.add(new int[]{key, map.get(key)});
            int sum = 0;
            int index = 0;
            while (index < x && !queue.isEmpty()){
                int[] n = queue.remove();
                sum += (n[0] * n[1]);
                index++;
            }
            result[i] = sum;
        }
        return result;
    }
}
