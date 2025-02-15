class A{

    public A() {
         System.out.println("Parent class constrauctor ");
    }
          
}
class B extends A{
          public B(){
                    super();
                    System.out.println("@2nnd constreuctor ");
          }
}

public class AccessConstructor {
          public static void main(String[] args) {
              B s1=new B();
          }
          
}
