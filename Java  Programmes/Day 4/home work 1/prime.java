
import java.util.Scanner;


public class prime {

          public static  boolean  primeCheck(int num){
                    if(num<=1){
                              return false;
                    }
                    for(int i=2 ;i<=num/2 ;i++){
                              if((num%i)==0){
                                        return false;
                              }
                    }
                    return true;
          }
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the number");
              int num=sc.nextInt();
              if(primeCheck(num)){
                    System.out.println("Prime number");
              }else{
                    System.out.println("Not prime");
              }
          }
          
}
