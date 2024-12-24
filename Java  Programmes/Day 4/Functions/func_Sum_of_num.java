
import java.util.Scanner;


public class func_Sum_of_num {
          public static int  sumOfNumbers(int a , int b){
                    int Result=a+b;

                    return Result;
          }

          public static void main(String[] args) {
                    
              Scanner sc= new Scanner(System.in);
              System.out.println("enter the value a");
              int a=sc.nextInt();
              System.out.println("Enter the value of b :");
              int b=sc.nextInt();

              int sum= sumOfNumbers(a, b);

              System.out.println("Sum is :"+sum);
          }
          
}
