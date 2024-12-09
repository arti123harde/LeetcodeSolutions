package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class FindAllKDistantIndicesInArray {

    public static void main(String[] args) {
        System.out.println(findKDistantIndices(new int[]{3,4,9,1,3,9,5}, 9, 1));
        System.out.println(findKDistantIndices(new int[]{2,2,2,2,2}, 2, 2));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> keyIndices = new TreeSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key) keyIndices.add(i);
        }
        for(int i=0; i<nums.length; i++){
            for(int j : keyIndices) {
                if(Math.abs(j - i) <= k) {
                    result.add(i);
                    break;
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
