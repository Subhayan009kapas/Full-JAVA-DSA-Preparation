import java.util.*;

public class sum_of_natural_no {
          public static int sum(int n ){
                    if(n==0){
                              return 0;
                    }
                    if(n<0){
                              System.out.println("Number should be Non-negetive");
                              return 0;
                    }
                    return n+sum(n-1);

          }
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no");
              int n=sc.nextInt();
              
              int val=sum(n);
              System.out.println(val);
          }
}
