import java.util.*;
class  Contains{
          public static void main(String[] args) {
              ArrayList<String> list=new ArrayList<>();
              list.add("a");
              list.add("b");
              list.add("c");
              System.out.println(list);

              System.out.println(list.contains("a"));
              list.clear();
              System.out.println(list);
          }
}