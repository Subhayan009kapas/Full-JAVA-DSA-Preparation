
public class MergeSort {

    public static void concquer(int arr[], int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int merged[] = new int[high - low + 1];
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merged[k++] = arr[i++];
        }
        while (j <= high) {
            merged[k++] = arr[j++];
        }
        for (int m = low, n = 0; n < merged.length; m++, n++) {
            arr[m] = merged[n];
        }

    }

    public static void divide(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        concquer(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 9, 2, 5, 8};
        int low = 0;
        int high = arr.length - 1;
        divide(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
