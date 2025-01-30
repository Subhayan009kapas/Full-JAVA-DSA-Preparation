public class MazeProblem {
          public static int mazeSol(int i , int j , int m , int n){
                    if(i==m-1 && j==n-1){
                              return 1;
                    }
                    if(i==m || j==n){
                              return 0;
                    }
                    int rightCount=mazeSol(i, j+1, m, n);
                    int downCount=mazeSol(i+1, j, m, n);
                    return rightCount+downCount;
          }
          public static void main(String[] args) {
              int i=0;
              int j=0;
              int m=3;
              int n=3;
              System.out.println(mazeSol(i, j, m, n));

          }
}
