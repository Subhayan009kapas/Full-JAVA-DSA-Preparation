
import java.util.*;

public class QueueUsingCollection {

    public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();


        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.offer(7);

        while(!q.isEmpty()){
          System.out.println(q.poll());
        }

    }

}
