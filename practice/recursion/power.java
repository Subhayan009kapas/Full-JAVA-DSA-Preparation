
import java.util.Scanner;

public class power {
          public static int power(int x , int n){

                    if(n==0){
                              return 1;
                    }
                    if(x==0){
                              return 0;
                    }

                    return x*power(x, n-1);

          }
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              int x=sc.nextInt();
              int n=sc.nextInt();
              System.out.println("power is :"+power(x, n));

          }
}
