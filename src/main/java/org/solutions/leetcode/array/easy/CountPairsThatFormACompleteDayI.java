package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountPairsThatFormACompleteDayI {

    public static void main(String[] args) {
        System.out.println(countCompleteDayPairs(new int[]{12,12,30,24,24}));
        System.out.println(countCompleteDayPairs(new int[]{72,48,24,3}));
    }

    public static int countCompleteDayPairs(int[] hours) {
        int count = 0;
        int N = hours.length;
        for(int i=0; i<N; i++) for(int j=i+1; j<N; j++)  if((hours[i] + hours[j]) % 24 == 0) count++;
        return count;
    }
}
