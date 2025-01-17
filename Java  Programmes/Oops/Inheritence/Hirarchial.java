import bank;


class A{
          int age=48;
          String name="ram";
          void print(){
                    System.out.println("Hello guys");
          }
}
class B extends A{
          void  disp(){
                    System.out.println("My age is "+age);
          }
}
class C extends A{
          void write(){
                    System.out.println("Name is "+name);
          }
}

public class Hirarchial {
          public static void main(String[] args) {

                    C obj=new C();
                    obj.write();
                    obj.print();

                    B obj2=new B();
                    obj2.disp();
                    obj2.print();

                    bank.Account acc=new bank.Account();
                    acc.name="customer1";
              
          }
        
          
}
