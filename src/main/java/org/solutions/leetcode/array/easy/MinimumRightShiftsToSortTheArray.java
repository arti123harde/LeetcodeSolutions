package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class MinimumRightShiftsToSortTheArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        System.out.println(minimumRightShifts(list));
    }

    public static int minimumRightShifts(List<Integer> nums) {
        int count = 0;
        int moves = 0;
        for(int i=1; i<nums.size(); i++){
            if(nums.get(i) < nums.get(i-1)){
                count++;
                moves = i;
            }
        }
        if(count > 1) return -1;
        if(moves == 0) return 0;
        return nums.get(nums.size() - 1) > nums.get(0) ? -1 : nums.size() - moves;
    }
}