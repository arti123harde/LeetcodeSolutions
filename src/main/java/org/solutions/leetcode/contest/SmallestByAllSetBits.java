package org.solutions.leetcode.contest;

/**
 * @author Arti Harde
 */
public class SmallestByAllSetBits {

    public static void main(String[] args) {
        System.out.println(smallestNumber(1001));
    }

    public static int smallestNumber(int n) {
        while (true){
            if(Integer.toBinaryString(n).length() == Integer.bitCount(n)) return n;
            else n++;
        }
    }
}
