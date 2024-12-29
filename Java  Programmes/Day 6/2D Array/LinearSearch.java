
import java.util.Scanner;


public class LinearSearch {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no of row");
              int row=sc.nextInt();
              System.out.println("Enter the no of the col");
              int col=sc.nextInt();
              int array[][]=new int[row][col];

              // Take 2d array input 

              for(int i=0;i<row ;i++){
                    for(int j=0;j<col;j++){
                              System.out.println("Enter the value of index "+i+" "+j);
                              array[i][j]=sc.nextInt();
                    }

              }

            // Print the 2d array

              for(int i=0;i<row ;i++){
                    for(int j=0;j<col;j++){
                              System.out.print(array[i][j]+"   ");
                              
                    }
                    System.out.println();
                    
              }
              System.out.println();

              // Search the input elememnt in the matrix 

              System.out.println("Enter the value which u want to seach :");

              int x=sc.nextInt();

              for(int i=0;i<row ;i++){
                    for(int j=0;j<col;j++){
                              if(array[i][j]==x){
                                        System.out.println("Value is flond in index No :" + i+" "+j);
                                        break;
                              }
                              
                    }
                  
                    
              }



          }
}
