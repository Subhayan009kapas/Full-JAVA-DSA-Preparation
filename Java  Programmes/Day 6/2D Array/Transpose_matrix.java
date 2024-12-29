import java.util.*;
public class Transpose_matrix {

          public static void main(String args[]){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the no of rows :");
                    int row=sc.nextInt();
                    System.out.println("Enter the number  of col");
                    int col=sc.nextInt();
                    int array[][]=new int[row][col];
                    for(int i=0;i<row ;i++){
                              for(int j=0;j<col ;j++){
                                        System.out.println("Enter the element "+i+"  "+j);
                                        array[i][j]=sc.nextInt();
                              }
                    }
                    for(int i=0;i<row ;i++){
                              for(int j=0;j<col ;j++){
                                        System.out.print(array[i][j]+" ");
                              }
                              System.out.println();
                    }

                    // Transpose of a Matrix  

                    System.out.println("Tanspose of the matrix is :");
                   
                    for(int i=0;i<col ;i++){
                              for(int j=0;j<row;j++){
                                        System.out.print(array[j][i]+"  ");
                              }
                              System.out.println();
                    }


          }


          
}
