import java.util.*;

public class ReverseProcess2 {
          public static void main(String[] args) {
              Stack<Integer> s=new Stack<>();
              s.push(1);
              s.push(2);
              s.push(3);
              s.push(4);
              // create an another stack 
              Stack<Integer> s2=new Stack<>();
              while(!s.isEmpty()){
                    s2.push(s.peek()); // push from s to s1
                    s.pop();

              }
              while(!s2.isEmpty()){
                    System.out.println(s2.peek());
                    s.pop();
              }
              
          }
}
