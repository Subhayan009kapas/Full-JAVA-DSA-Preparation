import  java.util.*;

public class prime_number {
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the nubere to check");
              int number=sc.nextInt();
              boolean isPrime=true;

              if(number<=1){
                    isPrime=false;
              }else{
                    for(int i=2 ;i<number ;i++){
                              if(number%i ==0){
                                        isPrime=false;
                                        break;
                              }
                    }
              }

              if(isPrime){
                    System.out.println(number +"Prime number");
                  
              }else{
                    System.out.println(number + "nonprime ");
              }
          }
}
