
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        

        // add elemnts
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);


        //get lements 

        int element =list.get(0);
        System.out.println(element);

        //Add element in between

        list.add(1,1);
        System.out.println(list);


        //Set element

        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //Size of list

        int size=list.size();
        System.out.println(size);

        //loops

        for(int i=0;i<list.size() ;i++){
          System.out.print(list.get(i)+" ");
        }
        

        //sorting
        System.out.println();
        Collections.sort(list);
        System.out.println("sorted");
        System.out.println(list);







    }
}
