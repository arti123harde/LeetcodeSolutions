package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public static void main(String[] args) {
        System.out.println(canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
        System.out.println(canAttendMeetings(new int[][]{{7, 10}, {2, 4}}));
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        Comparator<int[]> comparator = Comparator.comparingInt((int[] a) -> a[0]);
        Arrays.sort(intervals, comparator);
        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1] > intervals[i+1][0]) return false;
        }
        return true;
    }
}
