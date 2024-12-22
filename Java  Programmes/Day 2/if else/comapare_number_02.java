import java.util.*;


public class comapare_number_02 {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the first number");
              int a=sc.nextInt();
              System.out.println("Enter the second number");
              int b=sc.nextInt();

              if(a==b){
                    System.out.println("Equal numbers");
              }
              else if(a>b){
                    System.out.println("A is greater ");
              }else{
                    System.out.println("B is greater");
              }

          }
}
