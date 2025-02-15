import java.util.*;

public class ArrayList2 {
          public static void main(String args[]){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(0);
                    list.add(2);
                    list.add(4);
                    list.add(9);
                    System.out.println(list);

                    //get element
                    list.get(0);
                    System.out.println(list.get(2));

                    //in any  index

                    list.add(0,5);
                    System.out.println(list);

                    // set lmet
                    list.set(0,3);
                    System.out.println(list);

                    //delete

                    list.remove(3);
                    System.out.println(list);

                    //size
                    System.out.println(list.size());

                    //sorting
                    Collections.sort(list);
                    System.out.println("all the sorted elements ");
                    System.out.println(list);

          }
          
}
