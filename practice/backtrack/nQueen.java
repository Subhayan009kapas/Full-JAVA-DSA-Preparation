
import java.util.*;



public class nQueen {
          public static  void save(List<List<String>> allboard ,  char board[][] ){
                    List<String> newboard=new ArrayList<>();
                    for(int i=0 ;i<board.length ;i++){
                              String row="";
                              for(int j=0;j<board.length ;j++){
                                        row+=board[i][j];
                                        
                              }
                              newboard.add(row);
                    }
                    allboard.add(newboard);
          }

          public static boolean  isSafe(int row , int col , char board[][]){

                    // Horizonttally
                    for(int j=0;j<board.length ;j++){
                              if(board[row][j]=='Q'){
                                        return false;
                              }
                    }

                    //Verticallty

                    for(int i=0 ; i<board.length ;i++){
                              if(board[i][col]=='Q'){
                                        return false;
                              }

                    }

                    // upper left
                    for(int r=row , c=col ; r>=0 && c>=0 ;r--,c--){
                              if(board[r][c]=='Q'){
                                        return false;
                              }
                    }
                    // upper right
                    for(int r=row , c=col ; r>=0 && c<board.length ; r-- , c++){
                              if(board[r][c]=='Q'){
                                        return false;
                              }
                    }
                    // lower left
                    for(int r=row , c=col ;r<board.length && c>=0 ;r++ , c--){
                              if(board[r][c]=='Q'){
                                        return false;
                              }
                    }

                    // lower right

                    for(int r=row , c=col ;r<board.length && c<board.length ; r++ , c++){
                              if(board[r][c]=='Q'){
                                        return false;
                              }
                    }
                    return true;
          }
          public static void helper(List<List<String>> allboard ,  char board[][] , int col){
                    if(col==board.length){
                              save(allboard , board);
                              return;
                    }
                   for(int row=0 ;row<board.length ;row++){
                      if(isSafe(row , col , board)){
                              board[row][col]='Q';
                              helper(allboard, board, col+1);
                              board[row][col]='.';
                      }
                   }

                    
          }
          public static void main(String[] args) {
                    int n=4;
              List<List<String>> allboard=new  ArrayList<>();
              char board[][]=new char[n][n];
              int col=0;
              helper(allboard, board, col);
              for(List<String> sol :allboard){
                    for(String item :sol){
                              System.out.println(item);
                              
                    }
                    System.out.println();
              }

          }
          
}
