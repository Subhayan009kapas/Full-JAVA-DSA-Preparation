
interface Animal{
          int eyes=2;
          void walk();
}
interface  Harbivore{
          public void walk(){
                    System.out.println("Thay also can work");
          }
}
class Horse implements Animal , Harbivore{
          public void walk(){
                    System.out.println("Walks on 2 lags");
          }
}
public class Interface1 {
          public static void main(String[] args) {
              Horse s1=new Horse();
              s1.walk();
          }
          
}
