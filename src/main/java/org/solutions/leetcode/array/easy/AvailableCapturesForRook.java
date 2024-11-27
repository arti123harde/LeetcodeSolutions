package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class AvailableCapturesForRook {

    public static void main(String[] args) {
        System.out.println(numRookCaptures(new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'R', '.', '.', '.', 'p'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}}));
    }

    public static int numRookCaptures(char[][] board) {
        int count = 0;
        for(int i=0; i < board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'R'){
                    int up = i-1;
                    while (up >= 0 && board[up][j] != 'B'){
                        if(board[up][j] == 'p'){
                            count++;
                            break;
                        }
                        up--;
                    }
                    int down = i+1;
                    while (down <= board.length-1 && board[down][j] != 'B'){
                        if(board[down][j] == 'p'){
                            count++;
                            break;
                        }
                        down++;
                    }
                    int left = j-1;
                    while (left >= 0 && board[i][left] != 'B'){
                        if(board[i][left] == 'p'){
                            count++;
                            break;
                        }
                        left--;
                    }
                    int right = j+1;
                    while (right <= board[0].length-1 && board[i][right] != 'B'){
                        if(board[i][right] == 'p'){
                            count++;
                            break;
                        }
                        right++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}
