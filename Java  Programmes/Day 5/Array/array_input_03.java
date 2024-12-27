
import java.util.Scanner;

public class array_input_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        // for taking input 
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number " + i);

            array[i] = sc.nextInt();
        }

        // for printing the result 
        System.out.println("Result is :");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
