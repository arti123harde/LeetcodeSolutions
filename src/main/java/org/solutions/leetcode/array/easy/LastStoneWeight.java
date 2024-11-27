package org.solutions.leetcode.array.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class LastStoneWeight {

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[]{1}));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone: stones) heap.add(stone);
        while (heap.size() > 1){
            int s1 = heap.remove();
            int s2 = heap.remove();
            if(s1 != s2) heap.add(s1 - s2);
        }
        return heap.isEmpty() ? 0 : heap.remove();
    }
}
