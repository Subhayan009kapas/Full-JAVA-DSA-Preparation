
import java.util.*;
public class armStrongNumber {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the nuimber");
              int num=sc.nextInt();
              int Orginal_number=num;
              int sum=0;

              int digits=String.valueOf(num).length();

              while(num>0){
                    int rem=num%10;
                 
                    sum+= Math.pow(rem, digits);
                 
                    num=num/10;
                
              }
              
             if(sum==Orginal_number){
                    System.out.println("Yes !! It's armstrong number");
             }else{
                    System.out.println("Not a armstrong number ");
             }
          




          }
}
