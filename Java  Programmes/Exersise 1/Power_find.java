
import java.util.Scanner;


public class Power_find {

          public static void power(int x,int n){
                    int result=1;
                    for(int i=1 ;i<=n ;i++){
                              result=result*x;
                    }
                    System.out.println("x^n value : "+result);
          }

          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the valueof x:");
              int x=sc.nextInt();
              System.out.println("Enter the value of n");
              int n=sc.nextInt();

              power(x, n);

          }
          
}
