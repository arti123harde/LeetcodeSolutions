package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class MinimumOperationsToCollectElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        System.out.println(minOperations(list, 2));
    }

    public static int minOperations(List<Integer> nums, int k) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=k; i++) set.add(i);
        for(int i=nums.size()-1; i>=0; i--) {
            set.remove(nums.get(i));
            count++;
            if(set.isEmpty()) break;
        }
        return count;
    }
}