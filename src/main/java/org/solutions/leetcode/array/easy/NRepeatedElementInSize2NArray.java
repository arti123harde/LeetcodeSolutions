package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class NRepeatedElementInSize2NArray {

    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
        System.out.println(repeatedNTimes(new int[]{2,1,2,5,3,2}));
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    public static int repeatedNTimes(int[] nums) {
        //Approach 1
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i : nums){
//            map.put(i, map.getOrDefault(i, 0) + 1);
//            if(map.get(i) == nums.length/2) return i;
//        }
//        return 0;

        //Approach 2 - Considering there will be repeated element within each ith to i+2 distance
        int current = nums[0];
        int previous = -1;
        for(int i=1; i<nums.length; i++){
            int temp = nums[i];
            if(current == temp || (previous != -1 && previous == temp)){
                return temp;
            }else{
                previous = current;
                current = temp;
            }
        }
        return current;
    }
}
