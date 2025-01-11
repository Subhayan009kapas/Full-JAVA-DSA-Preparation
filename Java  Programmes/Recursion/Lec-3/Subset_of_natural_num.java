import java.util.ArrayList;

public class Subset_of_natural_num {
          public static void find_subset(int n ,ArrayList<Integer> subset ) {
                    if(n==0){
                              System.out.println(subset);
                              return;
                    }

                    subset.add(n);
                    find_subset(n-1, subset);
                  

                    subset.remove(subset.size()-1);
                    find_subset(n-1, subset);
              
          }
        
          public static void main(String[] args) {
                 int n=3;
                 ArrayList<Integer> subset=new ArrayList<>();
                 find_subset(n, subset);
              
          }
}
