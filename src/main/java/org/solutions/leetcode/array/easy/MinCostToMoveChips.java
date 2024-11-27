package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MinCostToMoveChips {

    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[]{1,2,3}));
        System.out.println(minCostToMoveChips(new int[]{2,2,2,3,3}));
        System.out.println(minCostToMoveChips(new int[]{1,1000000000}));
    }

    public static int minCostToMoveChips(int[] position) {
        int cost = 0;
        Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd = new HashMap<>();
        for(int n : position){
            if(n % 2 == 0) even.put(n, even.getOrDefault(n, 0) + 1);
            else odd.put(n, odd.getOrDefault(n, 0) + 1);
        }
        if(even.keySet().size() > odd.keySet().size()){
            for(int k : odd.keySet()) cost += odd.get(k);
        }else if(even.keySet().size() < odd.keySet().size()){
            for(int k : even.keySet()) cost += even.get(k);
        }else{
            int cost1 = 0;
            int cost2 = 0;
            for(int k : odd.keySet()) cost1 += odd.get(k);
            for(int k : even.keySet()) cost2 += even.get(k);
            cost = Math.min(cost1, cost2);
        }
        return cost;
    }

}
