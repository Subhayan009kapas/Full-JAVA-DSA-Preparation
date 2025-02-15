class A{
          void disp(){
                    System.out.println("Hello world");
          }
}
class  B extends A{
          void show(){
                    super.disp();
                    System.out.println("It's magic ");
          }
}

public class AccessMthod {
          public static void main(String[] args) {
              B s1=new B();
              s1.show();
          }
          
}
