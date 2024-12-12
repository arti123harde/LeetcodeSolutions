package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class DetermineTheWinnerOfBowlingGame {

    public static void main(String[] args) {
        System.out.println(isWinner(new int[]{5,10,3,2}, new int[]{6,5,7,3}));
    }

    public static int isWinner(int[] player1, int[] player2) {
        int p1Score = getScore(player1);
        int p2Score = getScore(player2);
        if(p1Score > p2Score) return 1;
        else if(p2Score > p1Score) return 2;
        else return 0;
    }

    private static int getScore(int[] player){
        int score = 0;
        int n = player.length;
        if(n == 1) return player[0];
        if(player[0]==10) score = player[0] + 2 * player[1];
        else score = player[0] + player[1];
        for(int i=2; i<n; i++){
            if(player[i-1] == 10 || player[i-2] == 10)  score += player[i] * 2;
            else score +=player[i];
        }
        return score;
    }

}
