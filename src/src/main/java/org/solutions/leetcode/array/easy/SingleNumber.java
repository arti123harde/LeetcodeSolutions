package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
    }

    public static int singleNumber(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for(int n : nums){
            if(duplicates.contains(n)) duplicates.remove((Integer) n);
            else duplicates.add(n);
        }
        return duplicates.get(0);
    }
}