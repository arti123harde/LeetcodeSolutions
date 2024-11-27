package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class DistanceBetweenBusStops {

    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[]{7,10,1,12,11,14,5,0}, 7, 2));
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 3));
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 1));
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 2));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int d1 = 0;
        int d2 = 0;
        for(int i=0; i<distance.length; i++) {
            d1 += distance[i];
            if(i >= start && i < destination) d2 += distance[i];
        }
        return Math.min(d2, d1-d2);
    }
}
