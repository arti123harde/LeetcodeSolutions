package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Arti Harde
 */
public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9}, 1));
        System.out.println(addToArrayForm(new int[]{1,2,0,0}, 34));
        System.out.println(addToArrayForm(new int[]{2,7,4}, 181));
        System.out.println(addToArrayForm(new int[]{2,1,5}, 806));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int sum = k;
        for(int i = num.length-1; i >= 0; i--){
            sum += num[i];
            result.add(sum % 10);
            sum = sum / 10;
        }
        while (sum != 0){
            result.add(sum % 10);
            sum = sum / 10;
        }
        Collections.reverse(result);
        return result;
    }
}
