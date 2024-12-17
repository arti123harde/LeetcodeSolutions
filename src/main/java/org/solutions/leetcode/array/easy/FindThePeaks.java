package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class FindThePeaks {

    public static void main(String[] args) {
        System.out.println(findPeaks(new int[]{2,4,4}));
        System.out.println(findPeaks(new int[]{1,4,3,8,5}));
    }

    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> result = new ArrayList<>();
        int i = 1;
        while (i < mountain.length-1){
            if(mountain[i-1] < mountain[i] && mountain[i] > mountain[i+1]){
                result.add(i);
                i += 2;
            }else i++;
        }
        return result;
    }
}
