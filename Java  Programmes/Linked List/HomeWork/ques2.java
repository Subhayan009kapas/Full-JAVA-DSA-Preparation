//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.*;

public class ques2 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers between 1 to 50");
        System.out.println("How much eleent u wann to add : ");
        int n = sc.nextInt();

        //take input from user
        for (int i = 0; i < n; i++) {
            System.out.println("enter the " + i);
            int val = sc.nextInt();
            list.add(val);
        }
        System.out.println("Origianl linked list");
        System.out.println(list);


        // Delete >25

        for(int i=0 ;i<list.size() ;i++){
            if(list.get(i)>25){
                    list.remove(i);
            }
        }
        System.out.println("After deletion");
        System.out.println(list);

    }
}
