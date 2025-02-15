class A{
          void disp(){
                    System.out.println("First method ");
          }
          final void print(){
                    System.out.println("Final method");
          }
}
class  B extends A{
          @Override
          void disp(){
                    System.out.println("2nd method");
          }

          @Override
          void  print(){
                    System.out.println("2nd final method");   
          }
          // this method is final in the paren class
 
}
public class FinalMethod {
          public static void main(String[] args) {
              B s1=new B();
              s1.print();
              s1.disp();
          }
          
}
