import java.util.*;
public class LinkedList0 {
          public static void main(String[] args) {
                    LinkedList<String> list=new LinkedList<String>();

                    //Add -----

                    //AddFirst
                    list.addFirst("This");

                    //AddLast
                    list.addLast("Is ");
                    list.addLast("a");
                    list.addLast("LinkedList");
                    list.add("DSA");
                    System.out.println(list);

                    //size
                    System.out.println(list.size());

                    //loop

                    for(int i=0;i<list.size();i++){
                              System.out.print(list.get(i)+" -> ");
                    }
                    System.out.print("null");
                    System.out.println();


                    //Delete --------------

                    //DeleteFirst
                    list.removeFirst();
                    System.out.println(list);

                    // Delete Last
                    list.removeLast();
                    System.out.println(list);

                    //delete Index
                    list.remove(2);
                    System.out.println(list);




              
          }
}
