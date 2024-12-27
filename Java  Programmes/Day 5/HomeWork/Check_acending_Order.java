
import java.util.*;

public class Check_acending_Order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        boolean isAcending = true;

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAcending = false;
            }
        }

        if (isAcending) {
            System.out.println("Yes !! arrray is in acending order");
        } else {
            System.out.println("Array is in no in acending order");
        }

    }
}
