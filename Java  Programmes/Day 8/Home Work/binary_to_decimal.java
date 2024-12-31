
import java.util.Scanner;


public class binary_to_decimal {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the binary number");
              String binaryNum=sc.next();
              int sum=0;
             
              
          
              for(int i=0;i<binaryNum.length();i++){

                    // convert the charecter to the int

                   int digit=(binaryNum.charAt(binaryNum.length()-1-i))-'0';
                   sum+=Math.pow(2,i)*digit;

                   
              }
              System.out.println(sum);

      
         
          
          }
}
