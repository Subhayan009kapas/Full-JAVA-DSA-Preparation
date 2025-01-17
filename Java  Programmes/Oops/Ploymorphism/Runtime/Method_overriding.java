
class Animal {

    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    public void sound() {
        System.out.println("cat muee");
    }
}

public class Method_overriding {

    public static void main(String[] args) {
        Cat s1 = new Cat();
        s1.sound();
        Dog s2 = new Dog();
        s2.sound();

    }

}
