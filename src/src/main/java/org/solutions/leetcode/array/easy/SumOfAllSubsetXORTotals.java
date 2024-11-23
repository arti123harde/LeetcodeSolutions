package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class SumOfAllSubsetXORTotals {

    public static void main(String[] args) {
        System.out.println("Result ........" + subsetXORSum(new int[]{1,3}));
        System.out.println("Result ........" + subsetXORSum(new int[]{5,1,6}));
        System.out.println("Result ........" + subsetXORSum(new int[]{3,4,5,6,7,8}));
    }

    public static int subsetXORSum(int[] nums) {
        int sum = 0;
        List<List<Integer>> subsets = new ArrayList<>();
        findAllSubsets(nums, 0, new ArrayList<>(), subsets);
        for(List<Integer> subset : subsets){
            int xor = 0;
            for(int num : subset){
                xor = xor ^ num;
            }
            sum += xor;
        }
        return sum;
    }

    public static void findAllSubsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsets){
        if(index == nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        findAllSubsets(nums, index+1, subset, subsets);
        subset.remove(subset.size() - 1);
        findAllSubsets(nums, index+1, subset, subsets);
    }
}