

public class MazeMove_count {
          public static int  mazeMoveCount(int i, int j, int m,int n){

                    if(i==m || j==n){
                              return 0;
                    }
                    if(i==m-1 && j==n-1){
                              return 1;
                    }
                    

                  // right path
                  int rightPath=mazeMoveCount(i, j+1, m, n);

                  // down path
                  int downPath=mazeMoveCount(i+1, j, m, n);

                  return rightPath+downPath;


          }
          public static void main(String[] args) {
              int m=3 ;
              int n=3;
              int i=0; 
              int j=0;
             int TotalPath=mazeMoveCount(i, j, m, n);
             System.out.println("Total path is "+TotalPath);
          }
}
