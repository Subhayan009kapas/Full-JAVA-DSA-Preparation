
import java.util.*;

public class button_inputQ_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the your choice :");
            int button = sc.nextInt();

            if (button == 1) {
                System.out.println("Hello");

            } else if (button == 2) {
                System.out.println("Namaste");

            } else if (button == 3) {
                System.out.println("Bonjour");
                break;

            } else {
                break;
            }
        }

    }
}
