
public class Check_sorted_array {

    public static void checkSort(int array[], int idx) {

          if(idx==array.length-1){
                    System.out.println("Sorted");
                    return;
          }

          if(array[idx]<array[idx+1]){
                    checkSort(array, idx+1);
          }else{
                    System.out.println("Not sorted");
          }

      
    }

    public static void main(String[] args) {
        int array[] = {4,5, 3, 4, 5};
        int idx=0;
        checkSort(array, idx);
       
 

    }
}
