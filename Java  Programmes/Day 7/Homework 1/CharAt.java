import java.util.*;

public class CharAt {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the string");
              String input=sc.next();
              String username="";
              for(int i=0;i<input.length() ;i++){

                    if(input.charAt(i)=='@'){
                              break;
                    }else{
                              username+=input.charAt(i);
                    }

              }
              System.out.println(username);
          }
}
