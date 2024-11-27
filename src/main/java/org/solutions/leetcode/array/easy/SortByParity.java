package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class SortByParity {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int n : nums){
            if(n % 2 == 0) even.add(n);
            else odd.add(n);
        }
        int index = 0;
        for(int e : even){
            result[index] = e;
            index++;
        }
        for(int o : odd){
            result[index] = o;
            index++;
        }
        return result;
    }
}
