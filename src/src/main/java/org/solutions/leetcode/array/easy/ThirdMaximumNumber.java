package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3,2,1}));
        System.out.println(thirdMax(new int[]{1,2}));
        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }

    public static int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            if(!list.contains(n)) list.add(n);
        }
        list.sort(Collections.reverseOrder());
        if(list.size() > 2) return list.get(2);
        else return list.get(0);
    }
}
