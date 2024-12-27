
import java.util.*;
public class Gcd_of_number {
          public static void  GcdCal(int a ,int b){
                    while(b!=0){
                              int temp=b;
                                b=a%b;
                                a=temp;
                    }
                    System.out.println("GCD IS :"+a);
                    return;
          }
          public static void main(String args[]){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the 1st number");
                    int a=sc.nextInt();
                    System.out.println("Enter the 2nd number");
                    int b=sc.nextInt();

                    GcdCal(a, b);

          }
}
