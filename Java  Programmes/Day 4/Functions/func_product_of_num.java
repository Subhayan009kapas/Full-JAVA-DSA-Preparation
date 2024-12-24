
import java.util.Scanner;


public class func_product_of_num {

          public static int productOfNumber(int a , int b){

                 
                    return a*b;
          }

          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the input for a :");
              int a=sc.nextInt();
              System.out.println("Enter the input for b :");
              int b=sc.nextInt();

             System.out.println("The product result is : "+productOfNumber(a, b));

          }
          
}
