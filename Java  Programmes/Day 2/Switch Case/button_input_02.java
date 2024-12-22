import java.util.*;
public class button_input_02 {
           public static void main(String[] args) {
                    
               Scanner sc= new Scanner(System.in);
               System.out.println("Enter the your Choice : 1 or 2 or 3");

               int number=sc.nextInt();

               switch(number){

                    case 1:System.out.println("Helloe");
                    break;

                    case 2:System.out.println("Namasta");
                    break;

                    case 3: System.out.println("Bonjour");
                    break;

                    default: System.out.println("invalid number");

               }
           }
}
