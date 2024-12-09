package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class SpecialArrayWithXElementsGreaterEqualX {

    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{3,5}));
        System.out.println(specialArray(new int[]{0,0}));
        System.out.println(specialArray(new int[]{0,4,3,0,4}));
    }

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<=nums.length; i++){
            int index = nums.length;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end){
                int mid = (start + end) /2;
                if(nums[mid] >= i) {
                    index = mid;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            if (nums.length - index == i)  return i;
        }
        return -1;
    }
}
