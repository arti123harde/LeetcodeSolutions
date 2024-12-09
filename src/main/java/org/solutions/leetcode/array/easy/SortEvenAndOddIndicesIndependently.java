package org.solutions.leetcode.array.easy;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class SortEvenAndOddIndicesIndependently {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortEvenOdd(new int[]{36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34})));
        System.out.println(Arrays.toString(sortEvenOdd(new int[]{4,1,2,3})));
        System.out.println(Arrays.toString(sortEvenOdd(new int[]{2,1})));
    }

    public static int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        int index = 0;
        for(int n : even){
            nums[index] = n;
            index += 2;
        }
        odd.sort(Collections.reverseOrder());
        index = 1;
        for(int n : odd) {
            nums[index] = n;
            index += 2;
        }
        return nums;
    }
}
