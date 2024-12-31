import java.util.*;

public class decimal_to_binary {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the decimal number");
              int num=sc.nextInt();
              StringBuilder sb=new StringBuilder();
          while(num>0){

                   
                    sb.append(num%2);
                    num=num/2;

          }
          

          for(int i=0;i<sb.length()/2;i++){
                    int front=i;
                    int rear=sb.length()-1-i;
                    char frontval=sb.charAt(front);
                    char  rearval=sb.charAt(rear);
                    sb.setCharAt(front , rearval);
                    sb.setCharAt(rear , frontval);
                    
          }

          System.out.println("Binary no is "+sb);
       

          }

}
