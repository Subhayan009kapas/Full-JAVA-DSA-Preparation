
import java.util.*;
public class AddElement_to_last {
          public static void AddToBottom(  Stack<Integer> s , int data){
                    while(s.isEmpty()){
                              s.push(data);
                              return;
                    }
                    int top=s.pop();
                    AddToBottom(s, data);
                    s.push(top);
          }
          public static void main(String args[]){
                    Stack<Integer> s=new Stack<>();
                    s.push(1);
                    s.push(2);
                    s.push(3);
                    s.push(4);
                    AddToBottom(s, 10);
                    while(!s.isEmpty()){
                              System.out.println(s.peek());
                              s.pop();
                    }

          }
}
