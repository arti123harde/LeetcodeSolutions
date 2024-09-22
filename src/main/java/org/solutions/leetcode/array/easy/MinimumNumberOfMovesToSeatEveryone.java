package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MinimumNumberOfMovesToSeatEveryone {

    public static void main(String[] args) {
        System.out.println(minMovesToSeat(new int[]{3,1,5}, new int[]{2,7,4}));
        System.out.println(minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6}));
        System.out.println(minMovesToSeat(new int[]{2,2,6,6}, new int[]{1,3,2,6}));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0; i<seats.length; i++){
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}