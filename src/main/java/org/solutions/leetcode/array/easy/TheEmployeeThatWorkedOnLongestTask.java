package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class TheEmployeeThatWorkedOnLongestTask {

    public static void main(String[] args) {
        System.out.println(hardestWorker(10, new int[][]{{0, 10}, {1, 20}}));
        System.out.println(hardestWorker(10, new int[][]{{0, 3}, {2, 5}, {0, 9}, {1, 15}}));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1];
        int eid = logs[0][0];
        for(int i=1; i<logs.length; i++){
            int diff = logs[i][1] - logs[i-1][1];
            if(diff > max || (diff == max && eid > logs[i][0])){
                eid = logs[i][0];
                max = diff;
            }
        }
        return eid;
    }
}