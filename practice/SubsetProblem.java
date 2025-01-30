
import java.util.ArrayList;

public class SubsetProblem {
          public static void subsetSol(int n , ArrayList<Integer> subset){
                    if(n==0){
                              System.out.println(subset);
                              return;
                    }
                    subset.add(n);
                    subsetSol(n-1, subset);`

                    subset.remove(subset.size()-1);
                    subsetSol(n-1, subset);
          }
          public static void main(String[] args) {
              int n=3;
              ArrayList<Integer> subset=new ArrayList<>();
              subsetSol(n, subset);
          }
}
