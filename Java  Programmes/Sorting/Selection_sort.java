
import java.util.Scanner;



public class Selection_sort{
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter  the size of the array");
              int n=sc.nextInt();
              int array[]=new int[n];
              for(int i=0;i<n ;i++){
                    System.out.println("Enter the element "+i);
                    array[i]=sc.nextInt();
              }

              for(int i=0;i<n-1 ;i++){
                    int min=i;
                    for(int j=i+1;j<n;j++){
                              if(array[j]<array[min]){
                                        min=j;
                              }
                    }
                    int temp=array[i];
                    array[i]=array[min];
                    array[min]=temp;

              }
              System.out.println("The Sorted array is :");

              for(int i=0;i<n;i++){
                    System.out.print(array[i]+" ");
              }
          }
}