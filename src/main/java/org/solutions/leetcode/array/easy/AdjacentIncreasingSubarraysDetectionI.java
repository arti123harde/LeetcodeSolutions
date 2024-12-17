package org.solutions.leetcode.array.easy;

import java.util.List;

/**
 * @author Arti Harde
 */
public class AdjacentIncreasingSubarraysDetectionI {

    public static void main(String[] args) {
        System.out.println(hasIncreasingSubarrays(List.of(-15, 19), 1));
        System.out.println(hasIncreasingSubarrays(List.of(2,5,7,8,9,2,3,4,3,1), 3));
    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i = 0; i<nums.size() - k; i++){
            int s1 = 1;
            int s2 = 1;
            for(int j = i; j < nums.size() && s1 < k; j++) if(nums.get(j) < nums.get(j+1)) s1++; else break;
            for(int j = i + k; j < nums.size()  && s2 < k; j++) if(nums.get(j) < nums.get(j+1)) s2++; else break;
            if(s1 == k && s2 == k) return true;
        }
        return false;
    }
}
