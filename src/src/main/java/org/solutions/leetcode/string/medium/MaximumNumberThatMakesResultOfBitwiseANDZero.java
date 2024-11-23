package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class MaximumNumberThatMakesResultOfBitwiseANDZero {

    public static void main(String[] args) {
        System.out.println(maxNumber(971417117793L));
        System.out.println(maxNumber(9));
        System.out.println(maxNumber(7));
        System.out.println(maxNumber(17));
    }

    public static long maxNumber(long n) {
//        long num = n-1;
//        long b = n;
//        while (true){
//            b = b & num;
//            if(b != 0){
//                num--;
//            }else{
//                break;
//            }
//        }
//        return num;
        long res = n - 1;
        while (n > 0) {
            n = n - (n & -n);
            if (n > 0) {
                res = Math.min(res, n - 1);
            }
        }
        return res;
    }
}