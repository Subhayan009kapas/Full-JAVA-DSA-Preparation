class Shape {
       int l=2;
       int h=5;
       
}
class Triangle extends Shape{
         public void print(){
          int res=l*h;
          System.out.println(res);
         }
}

public class Single_level {
          public static void main(String[] args) {
              Triangle s1=new Triangle();
              s1.print();
          }
          
}
