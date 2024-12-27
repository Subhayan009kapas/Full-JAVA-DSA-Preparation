
import java.util.*;



public class array_input_02 {
         
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the size of the array");
                    int size=sc.nextInt();
                    int marks[]=new int[size];

          

                   for(int i=0;i<size ;i++){
                    System.out.println("Enter the  elements :");

                       marks[i]=sc.nextInt();
                       
                   } 

                   System.out.println("The Array is :");

                   for (int i = 0; i < size; i++) {

                      System.out.print(marks[i]+ " ");
                   }

          }
}
