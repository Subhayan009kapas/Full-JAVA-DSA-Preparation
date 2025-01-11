public class TilesFitting {
          public static int fitStyles(int n , int m){

                    if(n==m){
                              return 2;
                    }
                    if(n<m){
                              return 1;
                    }
                    int horizontalCount=fitStyles(n-1, m);
                    int verticalCount=fitStyles(n-m, m);
                    return horizontalCount+verticalCount;
          }
          public static void main(String[] args) {
              int n=4 , m=2;
              int res=fitStyles(n, m);
              System.out.println(res);
          }
}
