
 class A{
           void print(){
            System.out.println("Hi");
           }
}

 class B extends A{
         void write(){
            System.out.println("Hello");
         }
}
class  C extends B{
         void disp(){
            System.out.println("oiii");
         }
}
public class Multilevel {
          public static void main(String[] args) {
              C obj =new C();
              obj.print();
              obj.disp();
              obj.write();
          }
          
}
