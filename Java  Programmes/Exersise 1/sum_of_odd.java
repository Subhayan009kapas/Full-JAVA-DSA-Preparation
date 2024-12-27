import java.util.*;

public class sum_of_odd {
          public  static void  odd_sum(int n){
                    int sum=0;

                    for(int i=1 ;i<=n;i++){
                              if((i%2)!=0){
                                        sum=sum+i;
                              }
                    }
                    System.out.println("Sum of numbers upto "+ n + " is "+sum);
                    return;

          }

          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the input nmber");
              int n= sc.nextInt();

              odd_sum(n);
             
          }
}
