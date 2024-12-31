
import java.util.Scanner;


public class Check_power_of_2_or_not {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the number");
              int num=sc.nextInt();
              if(num>0 && (num & (num-1))==0){
                    System.out.println("Power of 2");
              }else{
                    System.out.println("Not the power of 2");
              }
          }
}
