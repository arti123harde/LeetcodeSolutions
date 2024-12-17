package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class FinalArrayStateAfterKMultiplicationOperationsI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFinalState(new int[]{2,1,3,5,6}, 5, 2)));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->{
            if(Objects.equals(a[0], b[0])) return a[1] - b[1];
            else return a[0] - b[0];
        });
        for(int i=0; i<nums.length; i++) queue.add(new int[]{nums[i], i});
        while (k > 0){
            int[] n = queue.remove();
            n[0] *= multiplier;
            queue.add(n);
            k--;
        }
        while (!queue.isEmpty()){
            int[] n = queue.remove();
            nums[n[1]] = n[0];
        }
        return nums;
    }
}
