import java.util.*;

public class Spiral_matrix {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the size of row");
              int n=sc.nextInt();
              System.out.println("Enter the size of col");
              int m=sc.nextInt();
              int array[][]=new int[n][m];
              for(int i=0;i<n;i++){
                    for(int j=0 ;j<m;j++){
                              System.out.println("enter element  "+ i+" "+j);
                              array[i][j]=sc.nextInt();
                    }
              }

              System.out.println("Resultenet martrix :");

              for(int i=0;i<n;i++){
                    for(int j=0 ;j<m;j++){
                              System.out.print(array[i][j]+" ");
                    }
                    System.out.println();
              }


           // Code for spiral Matrix 

           int row_start=0;
           int row_end=n-1;
           int col_start=0;
           int col_end=m-1;


           //top to right

           while(row_start<=row_end &&  col_start<=col_end){

                    for(int i=col_start ;i<=col_end ;i++){
                              System.out.print(array[row_start][i]+" ");
          
                     }
          
                     //right to bottom 
                     for(int i=row_start+1 ; i<=row_end ;i++){

                              System.out.print(array[i][col_end]+" ");
          
                     }
          
                     // bottom to left 
                     for(int i=col_end-1 ;i>=col_start ;i--){
                              System.out.print(array[row_end][i]+" ");
          
                     }
          
                     // left to up 
                     for(int i=row_end-1 ;i>=row_start+1 ; i--){

                              System.out.print(array[i][col_start]+" ");
          
                     }

                     col_start++;
                     row_start++;
                     col_end--;
                     row_end--;
          
                    
           }

          
          

          }
}
