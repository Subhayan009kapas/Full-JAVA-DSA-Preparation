//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
import java.util.*;
public class ques1 {
          public static void main(String args[]){
                    LinkedList<Integer> list=new LinkedList<Integer>();

                    list.add(1);
                    list.add(5);
                    list.add(7);
                    list.add(3);
                    list.add(8);
                    list.add(2);
                    System.out.println(list);
                    if(list.contains(7)){
                              System.out.println("7 is here ");
                    }else{
                              System.out.println("7 is not here");
                    }
          }
}
