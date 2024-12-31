
import java.util.Scanner;

public class Insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i);
            array[i] = sc.nextInt();
        }

        // sorting 

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        System.out.println("The the sorted array is :");

        for(int i=0;i<array.length;i++){
          System.out.print(array[i]+" ");
        }
    }
}
