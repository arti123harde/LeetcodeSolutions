package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i : candies){
            max = Math.max(i, max);
        }
        for(int i : candies){
            if(i + extraCandies >= max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}