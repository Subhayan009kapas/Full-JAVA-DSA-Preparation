
import java.util.Scanner;

public class table_of_number {


          public static void table(int n){
                    for(int i=1 ;i<=10 ;i++){

                              System.out.print(i+"  ");

                    }
                    System.out.println();
                    for(int i=1 ;i<=10;i++){
                              
                              System.out.print(n*i+ " ");
                    }
                  
          }
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              int n=sc.nextInt();
              table(n);
          }
          
          
}
