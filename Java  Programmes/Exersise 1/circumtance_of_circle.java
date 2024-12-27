
import java.util.Scanner;



public class circumtance_of_circle {
          public static void circle_area(int redius){
                    double circumtances=2*3.14*redius;

                    System.out.println("Circumtances of circcle "+ Math.round(circumtances));

                    return ;
          }
          
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the  redius of the  circle");
                    int r=sc.nextInt();
                    circle_area(r);
                    
            
          }
          
}
