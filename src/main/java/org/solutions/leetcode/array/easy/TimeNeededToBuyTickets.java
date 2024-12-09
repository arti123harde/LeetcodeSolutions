package org.solutions.leetcode.array.easy;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

/**
 * @author Arti Harde
 */
public class TimeNeededToBuyTickets {

    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{5,1,1,1}, 0));
        System.out.println(timeRequiredToBuy(new int[]{2,3,2}, 2));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i< tickets.length; i++) queue.add(i);
        while (!queue.isEmpty()){
            count++;
            int t = queue.poll();
            tickets[t]--;
            if(t == k && tickets[t] == 0) break;
            else if(tickets[t] != 0) queue.add(t);
        }
        return count;
    }
}
