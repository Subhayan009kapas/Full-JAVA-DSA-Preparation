

import java.util.*;

public class nQueen2 {

          public static void save(List<List<String>> allboard , char board[][]){
                    List<String> newboard=new ArrayList<>();
                    
                    for(int i=0 ;i<board.length ;i++){
                              String row="";
                              for(int j=0 ;j<board.length ;j++){
                                        if (board[i][j] == 'Q') {
                                                  row+='Q';
                                        }else{
                                                  row+='.';
                                        }
                                       
                              }
                              newboard.add(row);
                    }
                    allboard.add(newboard);
          }

          public static boolean isSafe(int row , int col , char board[][]){
                    for(int j=0 ;j<board.length ; j++){
                              if(board[row][j]=='Q'){
                                        return false;
                              }
                    }
                    for(int i=0 ;i<board.length ;i++){
                              if(board[i][col]=='Q'){
                                        return false;
                              }
                    }

                    // upper left 
                    for(int r=row , c=col ; r>=0 && c>=0 ;r-- , c--){
                              if(board[r][c]=='Q'){
                                        return false;
                              }
                    }
                    //upper right
                    for(int r=row , c=col ; r>=0 && c<board.length ;r-- , c++){
                              if(board[r][c]=='Q'){
                                        return false;
                              }
                    }
                    // lower left

                    for(int r=row , c=col ; r<board.length && c>=0 ; r++ , c--){
                              if(board[r][c]=='Q'){
                                        return false;
                              }
                    }

                    // lower right
                    for(int r=row , c=col ; r<board.length && c<board.length ;r++ , c++){
                              if(board[r][c]=='Q'){
                                        return  false;
                              }
                    }
                    return true;
          }
          public static void helper(List<List<String>> allboard  , char board[][] , int row ){
                    if(row==board.length){
                              save(allboard , board);
                              return;
                    }

                    for(int col=0 ;col<board.length ;col++){
                              if(isSafe(row , col , board)){
                                        board[row][col]='Q';
                                        helper(allboard, board, row+1);
                                        board[row][col]='.';
                              }
                    }
                   



          }
          public static void main(String[] args) {
              List<List<String>> allboard =new ArrayList<>();
              int n=4;
              char board[][]=new char[n][n];
              int row=0;
              helper(allboard, board, row);
              // print

              System.out.println(allboard);
          }
}
