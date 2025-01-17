package subhayan;

// class B{
//           protected void  show(){
//                     System.out.println("proteced access modifier");
//           }
// }

// public class A {
//           public static void main(String[] args) {
//               B r=new B();
//               r.show();
//           }
          
// }

class B{
          protected void  show(){
                    System.out.println("proteced access modifier");
          }
}

 class A extends B{
          public static void main(String[] args) {
              A r=new A();
              r.show();
          }
          
}
