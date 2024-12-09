package org.solutions.leetcode.array.medium;


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class SpecialArrayII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 4}})));
    }

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        Map<Integer, Integer> map = new TreeMap<>();
        boolean[] result = new boolean[queries.length];
        int index = 0;
        for(int[] query : queries){

            boolean flag = true;
            for(int i=query[0]; i<query[1]; i++){
                 if((nums[i] % 2 == 0 && nums[i+1] % 2 == 0) || nums[i] % 2 != 0 && nums[i+1] % 2 != 0){
                     flag = false;
                     break;
                 }
            }
            result[index++] = flag;
            map.put(query[0], query[1]);
        }
        return result;
    }
}
