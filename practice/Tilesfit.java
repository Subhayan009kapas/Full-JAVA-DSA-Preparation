public class Tilesfit {
          public static int  tilesFitWays(int n, int m){
                    if(n==m){
                              return 2;
                    }
                    if(m>n){
                              return 1;
                    }
                    int vertical=tilesFitWays(n-m, m);
                    int horizontal=tilesFitWays(n-1 , m);
                    
                    return vertical+horizontal;
          }
          public static void main(String[] args) {
              int m=2;
              int n=4;
              System.out.println(tilesFitWays(n, m));

          }
}
