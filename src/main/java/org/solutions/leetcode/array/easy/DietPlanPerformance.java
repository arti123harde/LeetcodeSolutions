package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class DietPlanPerformance {

    public static void main(String[] args) {
        System.out.println(dietPlanPerformance(new int[]{1,2,3,4,5}, 1, 3, 3));
        System.out.println(dietPlanPerformance(new int[]{3,2}, 2, 0, 1));
        System.out.println(dietPlanPerformance(new int[]{6,5,0,0}, 2, 1, 5));
    }

    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        //Sliding Window Approach
        int points = 0;
        int start = 0;
        int sum = 0;
        for(int i=0; i<calories.length; i++){
            sum += calories[i];
            if(i - start + 1 > k){
                sum -= calories[start++];
            }
            if(i - start + 1 == k){
                if(sum < lower) points--;
                else if(sum > upper) points++;
            }
        }
        return points;
    }
}
