import java.util.*;

public class factorial {
          public static void factorialNum(int n ){
                    int factorial=1 ;
                    if(n<0){
                              System.out.println("Invalid input");
                              return;
                             
                    }

                   

                    for(int i=n ;i>=1 ;i--){

                              

                              factorial=factorial*i;
                    }
                    System.out.println("fact is "+factorial );

                    return;
          
          }

          public static void main(String[] args) {

              Scanner sc=new Scanner(System.in);

              System.out.println("enter the number :");

              int n=sc.nextInt();
              
              factorialNum(n);
             

          }
}
