abstract  class Animal{
          public abstract void walk();

}
class Dog extends  Animal{
          public void walk(){
                    System.out.println("Walks on 4 legs");
          }
}
class Chicken extends Animal{
          public void walk(){
                    System.out.println("Walks on 2 legs");
          }

}

public class Abstraction {
          public static void main(String[] args) {

                    Dog s1=new Dog();
                    s1.walk();
                    Chicken s2=new Chicken();
                    s2.walk();
              
          }
         
}
