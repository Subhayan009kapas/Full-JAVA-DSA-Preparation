
import java.util.Scanner;


public class Power_of_a_no {
          public static int power(int x , int n){
                    if(n==0){
                              return 1;
                    }
                    if(x==0){
                              return 0;

                    }
                    return x*power(x,n-1);

          }
         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the no");
             int x=sc.nextInt();
             System.out.println("Enter the power");
             int n=sc.nextInt();
             int result=power(x, n);
             System.out.println("The result is "+result);
         } 
}
