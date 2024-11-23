package org.solutions.leetcode.array.easy;

public record TeemoAttacking() {

    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,4}, 2));
        System.out.println(findPoisonedDuration(new int[]{1,2}, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = 0;
        for(int i=0; i<timeSeries.length; i++){
            if(i+1 < timeSeries.length) totalDuration += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
            else totalDuration += duration;
        }
        return totalDuration;
    }
}

