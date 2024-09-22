package org.solutions.leetcode.hashTable.easy;

import org.solutions.leetcode.common.PrintUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        PrintUtil.printArray(smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
        PrintUtil.printArray(smallerNumbersThanCurrent(new int[]{6,5,4,8}));
        PrintUtil.printArray(smallerNumbersThanCurrent(new int[]{7,7,7,7}));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
                for(int j=0; j< nums.length; j++){
                    if(j!=i && nums[i] > nums[j]){
                        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                    }
                }
            }
            result[i] = map.get(nums[i]);
        }
        return result;
    }
}