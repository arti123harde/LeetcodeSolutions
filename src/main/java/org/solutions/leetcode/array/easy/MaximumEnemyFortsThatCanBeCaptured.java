package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MaximumEnemyFortsThatCanBeCaptured {

    public static void main(String[] args) {
        System.out.println(captureForts(new int[]{1,0,0,-1,0,0,0,0,1}));
    }

    public static int captureForts(int[] forts) {
        int prev = -1;
        var total = 0;
        for(int i=0; i<forts.length; i++){
            if(forts[i] != 0 && prev == -1){
                prev = i;
                continue;
            }
            if(forts[i] != 0 && prev != -1 ){
                if(forts[i] + forts[prev] == 0) total = Math.max(total, i - prev + 1 - 2);
                prev = i;
            }
        }
        return total;
    }
}
