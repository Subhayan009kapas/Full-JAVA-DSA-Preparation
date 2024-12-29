
import java.util.Scanner;

public class Cumulative_length_01 {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the length of string");
              int size=sc.nextInt();
              String array[]=new String[size];
              int totalLength=0;

              for(int i=0;i<size ;i++){
                    System.out.println("enter the element no"+i);
                    array[i]=sc.next();
              }
              
              for(int i=0;i<size;i++){
                    totalLength+=array[i].length();
              }
              System.out.println("Total length "+totalLength);

          }
}
