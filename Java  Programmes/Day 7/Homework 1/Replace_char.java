
import java.util.Scanner;


public class Replace_char {
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the the String");
              String  input=sc.next();
              String  result="";
              for(int i=0;i<input.length() ;i++){
                   
                    if( input.charAt(i)=='e'){
                             result+='i';
                             
                    }else{
                              result+=input.charAt(i);
                        }

              }
              System.out.println(result);
          
          }
}
