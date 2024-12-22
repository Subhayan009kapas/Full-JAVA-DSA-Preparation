import java.util.*;
public class sum_of_number_02 {
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the Number");
              int number=sc.nextInt();
              int sum=0;
              int i=0;

              while(i<=number){
                    sum=sum+i;
                    i++;
              }
              System.out.println("Sum of Numbers is "+sum);

          }
}
