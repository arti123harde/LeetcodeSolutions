package org.solutions.leetcode.array.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class SubarraysDistinctElementSumOfSquaresI {

    public static void main(String[] args) {
        System.out.println(sumCounts(List.of(1,2,1)));
        System.out.println(sumCounts(List.of(1,1)));
    }

    public static int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            Set<Integer> distinctValues = new HashSet<>();
            for(int j=i; j<nums.size(); j++){
                distinctValues.add(nums.get(j));
                sum += (distinctValues.size() * distinctValues.size());
            }
        }
        return sum;
    }
}