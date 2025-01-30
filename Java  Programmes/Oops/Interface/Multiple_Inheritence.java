
interface Animal {

    void eat();

}

interface Pet {

    void sleep();

}

class Dog implements Animal, Pet {

    @Override
    public void eat() {
        System.out.println("Dog eat chikehen");
    }

    @Override
    public void sleep() {
        System.out.println("Dogg need sleep");
    }
}

class Cat implements Animal, Pet {

    @Override
    public void eat() {
        System.out.println("Cat drink milk");
    }

    @Override
    public void sleep() {
        System.out.println("Cat can sleep  any whree ");
    }
}

public class Multiple_Inheritence {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

    }
}
