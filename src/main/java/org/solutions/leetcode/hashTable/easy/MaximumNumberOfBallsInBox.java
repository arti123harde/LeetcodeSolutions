package org.solutions.leetcode.hashTable.easy;


/**
 * @author Arti Harde
 */
public class MaximumNumberOfBallsInBox {

    public static void main(String[] args) {
        System.out.println(countBalls(1, 10));
        System.out.println(countBalls(19, 28));
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int max = Integer.MIN_VALUE;
        int[] count = new int[46];
        for(int i=lowLimit; i<=highLimit; i++){
            int n = i;
            int sum = 0;
            while (n > 0){
                int rem = n % 10;
                sum += rem;
                n = n / 10;
            }
            max = Math.max(max, ++count[sum]);
        }
        return max;
    }
}
