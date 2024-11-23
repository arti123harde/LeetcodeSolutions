package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{0,1,3,50,75}, 0, 99));
        System.out.println(findMissingRanges(new int[]{-1}, -1, -1));
    }

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length > 0){
            if(lower < nums[0]){
                result.add(List.of(lower, nums[0]-1));
            }
            for(int i=0; i< nums.length-1; i++){
                if(nums[i+1] - nums[i] != 1){
                    result.add(List.of(nums[i]+1, nums[i+1]-1));
                }
            }
            if(upper > nums[nums.length-1]){
                result.add(List.of(nums[nums.length-1]+1, upper));
            }
        }else{
            result.add(List.of(lower, upper));
        }
        return result;
    }
}
