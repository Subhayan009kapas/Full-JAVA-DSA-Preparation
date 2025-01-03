
import java.util.*;
class Logn_Power{
          public static int power(int x , int n){
                    if(x==0){
                              return 0;
                    }
                    if(n==0){
                              return 1;
                    }
                    if(n%2==0){
                              return power(x, n/2)*power(x, n/2);
                    }else{
                              return power(x, n/2)*power(x, n/2)*x;
                    }
          }
          public static void main(String[] args) {

                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the number");
                    int x=sc.nextInt();
                    System.out.println("enter the power");
                    int n=sc.nextInt();
                    int result=power(x, n);
                    System.out.println("The Power of the number is "+result);

              
          }
}