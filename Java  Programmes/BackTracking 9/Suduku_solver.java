

public class Suduku_solver {
          public static boolean helper(char board[][], int row , int col){

                    if(row==board.length){
                              return true;
                    }
                    int newrow=0;
                    int newcol=0;
                    if(col!=board.length-1){
                              newcol=col+1;
                              newrow=row;
                    }else{
                              newrow=row+1;
                              newcol=0;
                    }

                    if(board[row][col]!='.'){
                              if(helper(board, newrow , newcol)){
                                        return  true;
                              }
                    }else{
                              for(int i=1;i<=9;i++){
                                        if(isSafe(board ,row , col , i)){
                                                  board[row][col]=(char)(i+'0');
                                                  if(helper(board,newrow , newcol)){
                                                            return true;
                                                  }else{
                                                            board[row][col]='.';
                                                  }
                                        }

                              }
                    }
                    return  false;

          }

          public static boolean isSafe(char board[][],int row , int col , int number){
                    for(int i=0;i<board.length;i++){
                              if(board[row][i]==(char)(number+'0')){
                                        return false;
                              }
                              if(board[i][col]==(char)(number+'0')){
                                        return false;
                              }

                    }
                    int sr=(row/3)*3;
                    int sc=(col/3)*3;

                    for(int i=sr;i<sr+3;i++){
                              for(int j=sc;j<sc+3;j++){
                                        if(board[i][j]==(char)(number+'0')){
                                                  return false;
                                        }
                              }
                    }


                    return true;

          }
          public static void main(String[] args) {
                    int row =0;
                    int col=0;
                    char board[][]=new char[9][9];
                    helper(board, row, col);

          }
}
