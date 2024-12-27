import  java.util.*;
public class fibonaccii {
          public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
              int n=sc.nextInt();
              int a=0;
              int b=1;
              System.out.print(a +" "+b);
              for(int i=0;i<=n ;i++){
                int next=a+b;
                System.out.print(" "+next+" ");
                a=b;
                b=next;
              }
          }
}
