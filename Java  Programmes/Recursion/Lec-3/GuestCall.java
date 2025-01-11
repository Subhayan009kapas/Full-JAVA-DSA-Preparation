public class GuestCall {
          public static int  guest(int n){
                    if(n<=1){
                              return 1;
                    }
                    // singels-singel guest call
                    int ways1 = guest(n-1);

                    // pair guest call

                    int ways2 = (n-1)*guest(n-2);

                    return ways1+ways2 ;


          }
          public static void main(String args[]){
                    int n=4;
                    int ways=guest(n);
                    System.out.println("No of ways are "+ways);

          } 
}
