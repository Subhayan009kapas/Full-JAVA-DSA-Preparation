public class Method_Overloading {
          String name;
          int age;
          public void print(String name){
                    System.out.println(name);
          }
          public void print(int age){
                    System.out.println(age);
          }
          public  void print(String name , int age){
                    System.out.println(name+" "+age);
          }
          public static void main(String[] args) {
              Method_Overloading obj=new Method_Overloading();
              obj.print("Subhayn");
              obj.print(21);
              obj.print("Akash" , 21);

          }
}
