package org.solutions.leetcode.array.easy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class BinaryPrefixDivisibleBy5 {

    public static void main(String[] args) {
        System.out.println(prefixesDivBy5(new int[]{1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1}));
        System.out.println(prefixesDivBy5(new int[]{0,1,1}));
        System.out.println(prefixesDivBy5(new int[]{1,1,1}));
    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        //Approach 1
        List<Boolean> list = new ArrayList<>();
        int rem = 0;
        for (int num : nums) {
            rem = (rem << 1) + num;
            if(rem >= 5)rem %= 5;
            list.add(rem == 0);
        }
        return list;

        //Approach 2
//        List<Boolean> list = new ArrayList<>();
//        StringBuilder s = new StringBuilder();
//        int sum = 0;
//        for (int num : nums) {
//            s.append(num);
//            sum = Integer.parseInt(s.toString(), 2);
//            if(sum >= 5) {
//                sum %= 5;
//                s = new StringBuilder(Integer.toBinaryString(sum));
//            }
//            list.add(sum == 0);
//        }
//        return list;
    }
}
