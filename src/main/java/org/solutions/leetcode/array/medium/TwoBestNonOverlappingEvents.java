package org.solutions.leetcode.array.medium;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class TwoBestNonOverlappingEvents {

    public static void main(String[] args) {
        System.out.println(maxTwoEvents(new int[][]{{1, 3, 2}, {4, 5, 2}, {2, 4, 3}}));
    }

    public static int maxTwoEvents(int[][] events) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int maxVal = 0;
        int maxSum = 0;
        for (int[] event : events) {
            while (!pq.isEmpty() && pq.peek().getKey() < event[0]) {
                maxVal = Math.max(maxVal, pq.peek().getValue());
                pq.poll();
            }
            maxSum = Math.max(maxSum, maxVal + event[2]);
            pq.add(new Pair<>(event[1], event[2]));
        }
        return maxSum;
    }
}
