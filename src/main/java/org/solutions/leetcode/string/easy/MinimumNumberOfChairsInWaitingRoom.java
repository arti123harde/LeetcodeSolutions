package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MinimumNumberOfChairsInWaitingRoom {

    public static void main(String[] args) {
        System.out.println(minimumChairs("EEEEEEE"));
        System.out.println(minimumChairs("ELELEEL"));
        System.out.println(minimumChairs("ELEELEELLL"));
    }

    public static int minimumChairs(String s) {
        int count = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                count++;
                max = Math.max(max, count);
            }else if(s.charAt(i) == 'L'){
                count--;
            }
        }

        return max;
    }
}