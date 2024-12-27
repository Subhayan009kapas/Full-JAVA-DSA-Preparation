
import java.util.Scanner;


public class Max_min_Element {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the size of the array");
              int size =sc.nextInt();
              int array[]=new int[size];
              for(int i=0;i<size ;i++){
                    array[i]=sc.nextInt();
              }

              System.out.println("The array is :");

              for(int i=0;i<array.length ;i++){
                    System.out.print(array[i]+" ");
              }

              System.out.println();

              // Max min find from that array

              int max=array[0];
              int min=array[0];

              for(int i=1;i<array.length;i++){

                    if(array[i]>max){
                              max=array[i];
                    }
                    if(array[i]<min){
                              min=array[i];
                    }
              }

              System.out.println("Min is "+min);
              System.out.println("Max is  "+max);
          }
}
