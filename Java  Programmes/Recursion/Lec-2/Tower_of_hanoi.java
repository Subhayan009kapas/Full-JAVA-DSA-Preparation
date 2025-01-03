
import java.util.Scanner;

public class Tower_of_hanoi {

    public static void hanoi(int n, String src, String help, String des) {
        if (n == 1) {
            System.out.println("Transfer " + n + " no of disk from " + src + " to " + des);
            return;
        }
        hanoi(n - 1, src, des, help);
        System.out.println("Transfer " + n + " no of disk from " + src + " to " + des);
        hanoi(n - 1, help, src, des);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n = sc.nextInt();
        hanoi(n, "S", "H", "D");

    }
}
