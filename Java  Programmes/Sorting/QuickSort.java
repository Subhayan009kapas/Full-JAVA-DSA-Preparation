
public class QuickSort {

    public static int partitioning(int arr[], int low, int high) {
        int i = low + 1;
        int j = high;
        int temp;
        int pivot = arr[low];
        do {
            // i going forward
            while (pivot>=arr[i] && i<high) {
                i++;
            }
            // j going backward
            while (pivot<arr[j]  && j>=0 ) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } while (i < j);

        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;  // partition index
    }

    public static void quicksort(int arr[], int low, int high) {

        if (low < high) {
            int partitionIndex = partitioning(arr, low, high);
            quicksort(arr, low, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, high);

        }

    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int low = 0;
        int n = 6;
        quicksort(arr, low, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
