package org.solutions.leetcode.array.easy;

public class OnebitAndTwobitCharacters {

    public static void main(String[] args) {
        System.out.println(isOneBitCharacter(new int[]{0,0}));
        System.out.println(isOneBitCharacter(new int[]{1,0,0}));
        System.out.println(isOneBitCharacter(new int[]{1,1,1,0}));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1 && bits[0] == 0) return true;
        int i = 0;
        while(i < bits.length){
            if(bits[i] == 1) i = i+2;
            else if(bits[i] == 0) i++;
            if(i == bits.length-1 && bits[i] == 0) return true;
        }
        return false;
    }
}
