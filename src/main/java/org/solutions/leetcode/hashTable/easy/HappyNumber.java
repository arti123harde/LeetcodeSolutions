package org.solutions.leetcode.hashTable.easy;

import java.util.HashSet;

/**
 * @author Arti Harde
 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)){
            set.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    private static int getNextNumber(int num){
        int nextNum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            nextNum += rem * rem;
        }
        return nextNum;
    }
}
