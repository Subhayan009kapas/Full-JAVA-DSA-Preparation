import java.util.*;

public class third {
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              int choice;

          do { 
                    System.out.println("enter your choice 1 or 0");

                    choice = sc.nextInt();

              if(choice==1){
                    System.out.println("Enter the student marks");
 
                    int marks=sc.nextInt();
                    if(marks>=90 && marks<100){
                              System.out.println("this is good");
                    }else if(marks>=60 && marks<=89){
                              System.out.println("This is also Good");
                    }else{
                              System.out.println("This is good as well");
                    }
              }


              
          } while (choice !=0);
              


              
          }
}
