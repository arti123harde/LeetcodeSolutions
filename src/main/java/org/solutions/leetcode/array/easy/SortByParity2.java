package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class SortByParity2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{2,3})));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int n : nums){
            if(n % 2 == 0) {
                result[even] = n;
                even += 2;
            }else{
                result[odd] = n;
                odd += 2;
            }
        }
        return result;
    }
}
