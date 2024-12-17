package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class DistributeElementsIntoTwoArraysI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(resultArray(new int[]{2, 1, 3})));
        System.out.println(Arrays.toString(resultArray(new int[]{5,4,3,8})));
    }

    public static int[] resultArray(int[] nums) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2; i<nums.length; i++){
            if(list1.getLast() > list2.getLast()) list1.add(nums[i]);
            else list2.add(nums[i]);
        }
        int i = 0;
        int[] arr = new int[list1.size() + list2.size()];
        for(int n : list1) arr[i++] = n;
        for(int n : list2) arr[i++] = n;
        return arr;
    }
}
