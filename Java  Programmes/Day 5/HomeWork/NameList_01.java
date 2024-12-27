import java.util.*;

public class NameList_01 {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the  Number of names ");
              int size=sc.nextInt();
              String nameList[]=new String[size];
              
              for(int i=0;i<size ;i++){
                    System.out.println("Enter the name elemnet no "+i);
                    nameList[i]=sc.next();
              }

              System.out.println("The namList is :");

              for(int i=0; i<size ;i++){
                    System.out.print(nameList[i]+" ");
              }

            
          }
}
