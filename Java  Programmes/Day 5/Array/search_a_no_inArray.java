
import java.util.Scanner;


public class search_a_no_inArray {

          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
            
              System.out.println("Enter the size of the array :");
              int size=sc.nextInt();

              int array[]=new int[size];

              for(int i=0 ;i<size ;i++){
                    System.out.println("Enter the Element NO "+ i);
                    array[i]=sc.nextInt();
                    
              }
              System.out.println("The array is :");
              for(int i=0;i<size ;i++){
                    System.out.print(array[i]+ " ");
              }
              System.out.println();

              // searching Part

              System.out.println("Enter the number which u want to  search :");
              int x=sc.nextInt();
              for(int i=0; i<array.length; i++){
                    if(array[i]==x){
                              System.out.println("Number is found in index No: "+i);
                    }
              }
              


          }
          
}
