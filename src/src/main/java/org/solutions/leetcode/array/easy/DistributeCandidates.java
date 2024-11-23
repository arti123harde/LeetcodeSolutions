package org.solutions.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandidates {

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
        System.out.println(distributeCandies(new int[]{6,6,6,6}));
    }

    public static int distributeCandies(int[] candyType) {

        //Solution 1 - O(NlogN)
//        int maxCandies = 1 ;
//        Arrays.sort(candyType);
//        int lastCandy = candyType[0];
//        for(int n : candyType){
//            if(lastCandy != n){
//                lastCandy = n;
//                maxCandies++;
//            }
//            if(maxCandies > candyType.length / 2){
//                return candyType.length / 2;
//            }
//        }
//        return maxCandies;

        //Solution 2 - O(N)
        Set<Integer> set = new HashSet<>();
        for(int n : candyType){
            set.add(n);
            if(set.size() > candyType.length / 2){
                return candyType.length / 2;
            }
        }
        return set.size();
    }
}
