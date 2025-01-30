interface Animal{
          void walk(); //abastract method
          void eat(); // abstrat method

          default public  void sound(){  // defalut mthod
                    System.out.println("All animal makes sound");
          }
}



class Dog implements Animal{

          @Override
          public void walk(){
                    System.out.println("Dog has 4clegs ");
          }
          @Override
          public void eat(){
                    System.out.println("Dog eat meat");
          }
}
class Cat implements Animal{

          @Override
          public void walk(){
                    System.out.println("cat walks in 4 legs ");
          }
          @Override
          public void eat(){
                    System.out.println("cat drink milk");
          }
}




public class Interface2 {

          public static void main(String[] args) {
                    Animal dog=new Dog();
                    dog.eat();
                    dog.walk();
                    dog.sound();

                    Animal cat=new Cat();
                    cat.eat();
                    cat.walk();
                    cat.sound();

                    
              
          }




          
}
