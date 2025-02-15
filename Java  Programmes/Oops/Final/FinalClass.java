final class A{
          void disp(){
                    System.out.println("Hello world");
          }
}
// this class can not be inherits because "A " classs is the final class 
class B extends A{    
          void disp(){
                    System.out.println("World");
          }
}

public class FinalClass {
          public static void main(String[] args) {
              B s1=new B();
              s1.disp();
          }
          
}
