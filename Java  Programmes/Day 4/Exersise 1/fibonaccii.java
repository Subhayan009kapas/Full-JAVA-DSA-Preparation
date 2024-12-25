public class fibonaccii {
          public static void main(String[] args) {
              int n=8;
              for(int i=0 ;i<=n ;i++){
                    i=(i-(i-1))+(i-(i-2));
                    System.out.print(i);
              }
          }
}
