package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Arti Harde
 */
public class SeparateTheDigitsInArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits(new int[]{13, 25, 83, 77})));
        System.out.println(Arrays.toString(separateDigits(new int[]{7,1,3,9})));
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            Stack<Integer> stack = new Stack<>();
            while (n > 0){
                stack.push(n % 10);
                n = n / 10;
            }
            while (!stack.isEmpty()) list.add(stack.pop());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
