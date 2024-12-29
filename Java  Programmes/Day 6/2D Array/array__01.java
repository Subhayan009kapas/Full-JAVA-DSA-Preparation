
import java.util.*;
public class array__01 {
          public static  void main(String args[]){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the size of the row");
                    int row=sc.nextInt();

                    System.out.println("Enter the size of the col ");
                    int col=sc.nextInt();

                    int array[][]=new int[row][col];
                    for(int i=0;i<row ;i++){
                              for(int j=0;j<col;j++){

                                        System.out.println("enter the value of index :"+i +" "+j);

                                        array[i][j]=sc.nextInt();

                              }
                    }

                    System.out.println("Resultent matrix is :");

                    for(int i=0;i<row ;i++){
                              for(int j=0;j<col;j++){

                                        System.out.print(array[i][j]+"   ");

                              }
                              System.out.println();
                    }
                    
          }
}
