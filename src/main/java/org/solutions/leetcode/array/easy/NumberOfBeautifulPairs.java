package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class NumberOfBeautifulPairs {

    public static void main(String[] args) {
        System.out.println(countBeautifulPairs(new int[]{2,5,1,4}));
    }

    public static int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            int n1 = nums[i];
            while (n1 >= 10) n1 /= 10;
            for(int j=i+1; j<nums.length; j++){
                int n2 = nums[j] % 10;
                if(gcd(n1, n2) == 1) count++;
            }
        }
        return count;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
