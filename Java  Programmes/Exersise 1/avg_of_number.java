
import java.util.Scanner;

public class avg_of_number {

          public static void avgOfNum(int a , int b ,int c){
                    int avg=(a+b+c)/3;
                    System.out.println("avg of threee number is :"+avg);

                    return ;

          }
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("enter the num1 ");
              int a=sc.nextInt();
              System.out.println("enter the num 2");
              int b=sc.nextInt();

              System.out.println("Enter the num 3");
              int c= sc.nextInt();

              avgOfNum(a, b, c);

              

          }
          
}
