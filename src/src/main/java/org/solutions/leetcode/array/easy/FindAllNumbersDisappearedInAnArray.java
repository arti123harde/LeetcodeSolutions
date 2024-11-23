package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, true);
        }
        for(int i=1; i<= nums.length; i++){
            if(!map.containsKey(i)) result.add(i);
        }
        return result;
    }
}
