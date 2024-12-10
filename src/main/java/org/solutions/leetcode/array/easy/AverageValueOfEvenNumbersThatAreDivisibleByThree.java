package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class AverageValueOfEvenNumbersThatAreDivisibleByThree {

    public static void main(String[] args) {
        System.out.println(averageValue(new int[]{1,3,6,10,12,15}));
        System.out.println(averageValue(new int[]{1,2,4,7,10}));
    }

    public static int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int n : nums){
            if(n % 6 == 0){
                sum += n;
                count++;
            }
        }
        return sum == 0 ? sum : sum / count;
    }
}
