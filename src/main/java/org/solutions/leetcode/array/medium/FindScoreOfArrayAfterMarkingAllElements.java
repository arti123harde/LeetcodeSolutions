package org.solutions.leetcode.array.medium;

import java.util.Objects;
import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class FindScoreOfArrayAfterMarkingAllElements {

    public static void main(String[] args) {
        System.out.println(findScore(new int[]{2,1,3,4,5,2}));
        System.out.println(findScore(new int[]{2,3,5,1,3,2}));
    }

    public static long findScore(int[] nums) {
        long result = 0;
        boolean[] arr = new boolean[nums.length];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->{
            if(Objects.equals(a[0], b[0])) return a[1] - b[1];
            else return a[0] - b[0];
        });
        for(int i=0; i<nums.length; i++) queue.add(new int[]{nums[i], i});
        while (!queue.isEmpty()){
            int[] element = queue.remove();
            if(!arr[element[1]]){
                result += element[0];
                arr[element[1]] = true;
                if(element[1] > 0) arr[element[1] - 1] = true;
                if(element[1] < nums.length-1) arr[element[1] + 1] = true;
            }
        }
        return result;
    }
}
