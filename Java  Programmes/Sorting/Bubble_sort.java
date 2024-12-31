
import java.util.Scanner;

class Bubble_sort{
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the size of the array :");
                    int size=sc.nextInt();
                    int array[]=new int[size];
                    // Take the input of the array
                    for(int i=0;i<size;i++){
                              System.out.println("Enter the array elemnt :"+i);
                              array[i]=sc.nextInt();
                    }
                  //Main operation for sorting
                    for(int i=0;i<array.length-1;i++){
                              for(int j=0;j<size-1-i ;j++){
                                        if(array[j]>array[j+1]){
                                                  int temp=array[j];
                                                  array[j]=array[j+1];
                                                  array[j+1]=temp;
                                        }

                              }
                    }
                    System.out.println("The Sorted array is :");

                  // Printing the array  after sort
                    for(int i=0;i<size;i++){
                              System.out.print(array[i]+" ");

                    }
          }
}