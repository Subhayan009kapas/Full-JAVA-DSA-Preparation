class A{
          int a=20;
}
class B extends A{
          int a=10;
          void show(){
                    System.out.println(a);
                    System.out.println(super.a);
          }
}

public class AccessVeriable {
          public static void main(String[] args) {
              B s1=new B();
              s1.show();;
          }
          
}
