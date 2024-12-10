package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class LargestPositiveIntegerThatExistsWithItsNegative {

    public static void main(String[] args) {
        System.out.println(findMaxK(new int[]{-1,10,6,7,-7,1}));
        System.out.println(findMaxK(new int[]{-1,2,-3,3}));
        System.out.println(findMaxK(new int[]{-10,8,6,7,-2,-3}));
    }

    public static int findMaxK(int[] nums) {
        //Approach 1
//        Arrays.sort(nums);
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right){
//            if(nums[right] == Math.abs(nums[left])) return nums[right];
//            else if(nums[right] > Math.abs(nums[left])) right--;
//            else if(nums[right] < Math.abs(nums[left])) left++;
//        }
//        return -1;


        //Approach 2 - Set two pass
//        Set<Integer> set = new HashSet<>();
//        for(int n : nums) set.add(n);
//        int max = -1;
//        for(int i : nums){
//            if(i < 0 && set.contains(-i) && max < -i) max = -i;
//        }
//        return max;

        //Approach 3 - Set one pass
        Set<Integer> set = new HashSet<>();
        int max = -1;
        for(int i : nums){
            int abs = Math.abs(i);
            if(max < abs && set.contains(-i)) max = abs;
            set.add(i);
        }
        return max;
    }
}
