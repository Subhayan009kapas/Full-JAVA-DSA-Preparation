
import java.util.ArrayList;
import java.util.List;

public class nQueenProblem {

    public static boolean isSafe(int row, int col, char board[][]) {

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // Horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upperright
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void save(List<List<String>> allboard ,char board[][]) {
          
          List<String> newboard=new ArrayList<>();
          for(int i=0;i<board.length;i++){
            String row="";
                    for(int j=0 ;j<board.length ;j++){
                              row+=board[i][j];

                    }                                                               
                    newboard.add(row);
          }
          allboard.add(newboard);
        
    }

    public static void helper(List<List<String>> allboard, char board[][], int col) {

        if (col == board.length) {
            save(allboard, board);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(allboard, board, col + 1);
                board[row][col] = '.';
            }
        }

    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> allboard = new ArrayList<>();
        char board[][] = new char[n][n];
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(allboard, board, col);

        for(List<String>  sol: allboard){
          for(String row:sol){
                    System.out.println(row);
          }
        }

    }
}
