import java.util.*;

class Str_reverse_recursion{
          public static void reverse(String str , int index) {
                    if(index<0){
                              return;
                    }
                    System.out.print(str.charAt(index));
                    reverse(str, index-1);

              
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the String ");
                    String str=sc.next();
                    int index=str.length()-1;
                    reverse(str, index);


          
          }
}