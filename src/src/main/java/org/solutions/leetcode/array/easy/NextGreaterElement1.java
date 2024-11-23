package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    public static void main(String[] args) {
        PrintUtil.printArray(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
        PrintUtil.printArray(nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        /**
         * Brute Force approach
         * Time Complexity - O(m*n) - (nums1.length * nums2.length)
         * Space Complexity - O(1) - space required to store boolean flag
         */
//        int count;
//        for(int i=0; i<nums1.length; i++){
//            boolean found = false;
//            for(count=0; count< nums2.length; count++){
//                if(nums2[count] == nums1[i]){
//                    found = true;
//                }
//                if(found && nums2[count] > nums1[i]){
//                    result[i] = nums2[count];
//                    break;
//                }
//            }
//            if(count == nums2.length){
//                result[i] = -1;
//            }
//        }
        /**
         * Using Stack
         * Time Complexity - O(n) - (nums2.length)
         * Space Complexity - O(n) - extra stack space to store keys
         */
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums2) {
            while (!stack.empty() &&  j > stack.peek()) {
                map.put(stack.pop(), j);
            }
            stack.push(j);
        }
        while (!stack.empty()) map.put(stack.pop(), -1);
        for(int i=0; i<nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
