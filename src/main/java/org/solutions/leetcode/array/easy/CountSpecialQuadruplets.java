package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class CountSpecialQuadruplets {

    public static void main(String[] args) {
        System.out.println(countQuadruplets(new int[]{28,8,49,85,37,90,20,8}));
        System.out.println(countQuadruplets(new int[]{1,2,3,6}));
        System.out.println(countQuadruplets(new int[]{3,3,6,4,5}));
        System.out.println(countQuadruplets(new int[]{1,1,1,3,5}));
    }

    public static int countQuadruplets(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                for(int k=j+1; k<nums.length-1; k++){
                    for(int l=k+1; l<nums.length; l++){
                        if(nums[i] + nums[j] + nums[k] == nums[l]){
                            System.out.println(i + "," + j + "," + k + "," + l);
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
