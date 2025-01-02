
import java.util.Scanner;


public class Recursive_factorial {
          public static int fact(int num) {
                    if(num==0 || num==1){
                              return 1;
                    }
                    return num*fact(num-1);
              
          }
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("enter the number ");
              int num=sc.nextInt();
              int result=fact(num);
              System.out.println("factorial of the number is "+result);

          }
}
