
import java.util.Scanner;

public class Find_greater_number {
          public static int findGreat(int a , int b){
                    if(a>b){

                              return a;

                    }else{
                              return b;
                    }
                   

          }

          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the first number :");
              int a=sc.nextInt();
              System.out.println("Enter the second number :");
              int b=sc.nextInt();

              int great=findGreat(a, b);
              System.out.println("Greater number is :"+great);

          }
          
}
