package org.solutions.leetcode.contest;

/**
 * @author Arti Harde
 */
public class ButtonWithLongestPushTime {

    public static void main(String[] args) {
        System.out.println(buttonWithLongestTime(new int[][]{{12, 2}, {8, 3}, {18, 5}, {4, 6},
                {3, 7}, {1, 9}, {2, 17}, {18, 20}}));
    }

    public static int buttonWithLongestTime(int[][] events) {
        int maxTime = events[0][1];
        int buttonIndex = events[0][0];
        for(int n=1; n<events.length; n++){
            int t = events[n][1] - events[n-1][1];
            if(t > maxTime || (t == maxTime && buttonIndex > events[n][0])){
                maxTime = t;
                buttonIndex = events[n][0];
            }
        }
        return buttonIndex;
    }
}
