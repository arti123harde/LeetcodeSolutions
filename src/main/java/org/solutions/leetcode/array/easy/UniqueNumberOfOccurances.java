package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class UniqueNumberOfOccurances {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,1,2,2,2,3,3,3,3,4}));
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[]{1,2}));
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int index = 0;
        int currentCount = 0;
        List<Integer> counts = new ArrayList<>();
        while(index < arr.length){
            if (index < arr.length-1 && arr[index] == arr[index+1]) currentCount++;
            else {
                if(counts.contains(currentCount)) return false;
                else counts.add(currentCount);
                currentCount = 0;
            }
            index++;
        }
        return true;
    }
}
