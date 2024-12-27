
import java.util.*;
public class eligibility {
          public static void elegibilityCheck(int age){
                    if(age>18){
                              System.out.println("You are eligible");
                    }else{
                              System.out.println("You are not eligible");
                    }

                    return;
          }

          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter your age");
              int age=sc.nextInt();
              elegibilityCheck(age);
          }

        
          


}
