import java.util.*;
public class Ques_3 {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enetr one email address");
              String email=sc.next();
              StringBuilder str=new StringBuilder(email);
              for(int i=0;i<str.length() ;i++){
                    if(str.charAt(i)=='@'){
                              str.delete(i, (str.length()));
                    }
              }
              System.out.println(str);
          }
}
