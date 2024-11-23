package org.solutions.leetcode.array.easy;

import javafx.util.Pair;
import org.solutions.leetcode.common.PrintUtil;

import java.util.PriorityQueue;

public class RelativeRanks {

    public static void main(String[] args) {
        PrintUtil.printArray(findRelativeRanks(new int[]{5,4,3,2,1}));
        PrintUtil.printArray(findRelativeRanks(new int[]{10,3,8,9,4}));
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];

        //Brute Force Approach
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i< score.length; i++){
//            map.put(score[i], i);
//        }
//        Arrays.sort(score);
//        for(int i = score.length-1; i >= 0; i--){
//            if(i == score.length-1) result[map.get(score[i])] = "Gold Medal";
//            else if(i == score.length-2) result[map.get(score[i])] = "Silver Medal";
//            else if(i == score.length-3) result[map.get(score[i])] = "Bronze Medal";
//            else result[map.get(score[i])] = String.valueOf(score.length - i);
//        }

        //Priority Queue
        // Create a max heap of pairs (score, index)
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        for (int i = 0; i < score.length; i++) {
            heap.add(new Pair<>(score[i], i));
        }
        int place = 1;
        while (!heap.isEmpty()) {
            Pair<Integer, Integer> pair = heap.poll();
            int index = pair.getValue();
            if (place == 1) {
                result[index] = "Gold Medal";
            } else if (place == 2) {
                result[index] = "Silver Medal";
            } else if (place == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(place);
            }
            place++;
        }

        return result;
    }
}
