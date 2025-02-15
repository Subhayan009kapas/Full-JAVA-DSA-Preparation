abstract  class Animal{
          public abstract void walk();
          Animal(){
                    System.out.println("Hello cons 1");
          }
          public void hard(){
                    System.out.println("  Hello it's  a normal calass  ");
          }

}
class Dog extends  Animal{
          Dog(){
                    System.out.println("Hello cons 2");
          }
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
                    s1.hard();;
                    
              
          }
         
}
