package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ConstructMinimumBitwiseArrayI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minBitwiseArray(List.of(2, 3, 5, 7))));
    }

    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] result = new int[nums.size()];
        for(int i=0; i<nums.size(); i++){
            result[i] = -1;
            for(int j=1; j<nums.get(i); j++) {
                if((j | j+1) == nums.get(i)) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }
}

