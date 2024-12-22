
import java.util.*;

public class Calculator_02 {

    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Your Operation : Press 1 : for Addition");
            System.out.println("Your Operation : Press 2 : for Substraction");
            System.out.println("Your Operation : Press 3 : for  Multiplication");
            System.out.println("Your Operation : Press 4 : for  Division ");
            System.out.println("Your Operation : Press 5: for  Modulus ");

            int operation = sc.nextInt();

            System.out.println("Enter Input 1 :");

            int a = sc.nextInt();

            System.out.println("Enter  the input 2:");

            int b = sc.nextInt();

            switch (operation) {

                case 1:
                    System.out.println("Addition Result is " + (a + b));
                    break;

                case 2:
                    System.out.println("Substraction Result " + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication is :" + (a * b));
                    break;

                case 4:
                    System.out.println("Division is :" + (a / b));
                    break;

                case 5:
                    System.out.println("Modulus  is :" + (a % b));
                    break;

                default:
                    System.out.println("Invalid input ");

            }

        }

    }

}
