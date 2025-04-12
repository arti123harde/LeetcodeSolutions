package org.solutions.leetcode.hashTable.easy;

/**
 * @author Arti Harde
 */
public class CheckIfTheNumberIsFascinating {

    public static void main(String[] args) {
        System.out.println(isFascinating(192));
    }

    public static boolean isFascinating(int n) {
        String num = n + String.valueOf(n * 2) + String.valueOf(n * 3);
        if(num.length() > 9) return false;
        if(num.contains("0")) return false;
        int[] arr = new int[10];
        for(char c : num.toCharArray()){
            int index = Integer.parseInt(String.valueOf(c));
            if(arr[index] == 0) arr[index] = 1;
            else return false;
        }
        return true;
    }
}
