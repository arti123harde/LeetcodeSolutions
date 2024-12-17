package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindTheSumOfEncryptedIntegers {

    public static void main(String[] args) {
        System.out.println(sumOfEncryptedInt(new int[]{1,2,3}));
        System.out.println(sumOfEncryptedInt(new int[]{10,21,31}));
    }

    public static int sumOfEncryptedInt(int[] nums) {
        //Approach 1
//        int sum = 0;
//        for(int n : nums){
//            int max = 0;
//            int count = 0;
//            while (n > 0){
//                max = Math.max(max, n % 10);
//                n = n / 10;
//                count++;
//            }
//            sum += Integer.parseInt(new StringBuilder().repeat(String.valueOf(max), count).toString());
//        }
//        return sum;

        //Approach 2
        int sum = 0;
        for(int n : nums){
            if (n < 10) sum += n;
            else if (n < 100) sum += 11 * Math.max(n % 10, n / 10);
            else if (n < 1000) sum += 111 * Math.max(n / 100, Math.max(n % 10, (n / 10) % 10));
            else sum += 1111;
        }
        return sum;
    }
}
