package org.solutions.leetcode.string.medium;

public class WordSearch {

    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "AL"));
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {
        int rn = board.length;
        int cn = board[0].length;
        for(int i=0; i<rn; i++){
            for(int j=0; j<cn; j++){
                if(board[i][j]==word.charAt(0)){
                    if(checkAdjacentCells(i, j, rn, cn, board, word,0)) return true;
                }
            }
        }
        return false;
    }

    private static boolean checkAdjacentCells(int i, int j, int rn, int cn, char[][] board, String word, int index){
        if(index == word.length()) return true;
        if(i<0 || j<0 || i==rn || j==cn || board[i][j]!=word.charAt(index)) return false;
        char temp = board[i][j];
        board[i][i] = '*';
        boolean found = checkAdjacentCells(i+1, j, rn, cn, board, word, index+1) ||
                checkAdjacentCells(i, j+1, rn, cn, board, word, index+1) ||
                checkAdjacentCells(i-1, j, rn, cn, board, word, index+1) ||
                checkAdjacentCells(i, j-1, rn, cn, board, word, index+1);
        board[i][j] = temp;
        return found;
    }
}
