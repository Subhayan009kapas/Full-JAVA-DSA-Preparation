import java.util.*;
public class Ques_2 {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the string input :");
              String input=sc.next();
              StringBuilder str=new StringBuilder(input);
              for(int i=0;i<input.length() ;i++){
                    if(input.charAt(i)=='e'){
                              str.setCharAt(i, 'i');

                    }
              }
              System.out.println(str);

          }
}
