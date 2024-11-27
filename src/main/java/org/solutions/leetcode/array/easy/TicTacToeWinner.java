package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class TicTacToeWinner {

    public static void main(String[] args) {
        System.out.println(tictactoe(new int[][]{{1,0},{0,1},{0,0},{2,0},{1,1},{2,1},{1,2}}));
        System.out.println(tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
        System.out.println(tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}));
        System.out.println(tictactoe(new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1},
                {0, 1}, {0, 2}, {2, 2}}));
    }

    public static String tictactoe(int[][] moves) {
        if(moves.length >= 5 && checkIfWins(moves, 0)) return "A";
        else if(moves.length >= 6 && checkIfWins(moves, 1)) return "B";
        else if(moves.length == 9) return "Draw";
        else return "Pending";
    }

    private static boolean checkIfWins(int[][] moves, int start){
//        int count = 1;
//        int x0 = moves[start+2][0] -  moves[start][0];
//        int y0 = moves[start+2][1] - moves[start][1];
//        for(int i=start+4; i<moves.length; i+=2){
//            int x1 = moves[i][0] - moves[start][0];
//            int y1 = moves[i][1] - moves[start][1];;
//            if(x1*y0 == x0*y1) count++;
//        }
//        return count >= 2;
        for(int i=start; i<moves.length; i+=2){
            for(int j=i+2; j<moves.length; j+=2){
                int x0 = moves[j][0] -  moves[i][0];
                int y0 = moves[j][1] - moves[i][1];
                for(int k=j+2; k<moves.length; k+=2){
                    int x1 = moves[k][0] -  moves[j][0];
                    int y1 = moves[k][1] - moves[j][1];
                    if(y1 * x0 == y0 * x1) return true;
                }
            }
        }
        return false;
    }
}
