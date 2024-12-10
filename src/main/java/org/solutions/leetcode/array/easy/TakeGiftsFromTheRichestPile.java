package org.solutions.leetcode.array.easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class TakeGiftsFromTheRichestPile {

    public static void main(String[] args) {
        System.out.println(pickGifts(new int[]{25,64,9,4,100}, 4));
        System.out.println(pickGifts(new int[]{1,1,1,1}, 4));
    }

    public static long pickGifts(int[] gifts, int k) {
        long total = 0;
        PriorityQueue<Long> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int gift: gifts){
            total += gift;
            heap.add((long)gift);
        }
        while(k > 0){
            long top = heap.remove();
            long rem = (long)Math.sqrt(top);
            total = total - top + rem;
            heap.add(rem);
            k--;
        }
        return total;
    }
}
